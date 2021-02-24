package ZooManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
	
	HashMap<String, ArrayList<Zone>> zooChart;
	static final int noOfZones = 15;
	static  int numberOfZonesCreated = 0;
	
	public boolean addAnimal(Animal animal){
		
		String type = animal.animalType;	
		Zone zone = getZone(type);
		Cage cage = null;
		
		if(numberOfZonesCreated == noOfZones && zone.isFull() ){
			return false;
		}else if(numberOfZonesCreated < noOfZones){
			if(zone.isFull()){
				zone = addZone(type);
			}	
			
			if(zone!=null)
				cage = zone.getCage();	
			
			if( cage!=null && cage.isFull()){
				cage = zone.addCage();
			}
			
			if(cage!=null)
				cage.addAnimal(animal);
			
			return true;
		}
		
		return false;
		
				
	}
	
	public Zone addZone(String type) {
		Zone zone = null;
		if(numberOfZonesCreated < noOfZones){
			numberOfZonesCreated++;
			zone = new Zone(type);
			zooChart.get(type).add(zone);
		}
		return zone;
	}

	public Zone getZone(String type){
		ArrayList<Zone> zones = zooChart.get(type);
		Zone zone = null;
		
		if(zones.size() == 0){
			zone = new Zone(type);
			zones.add(zone);
		}else{
			int lastZone = zones.size() - 1;
			zone = zones.get(lastZone);	
		}		
		return zone;	
	}

	public Zoo(String[] types){
		
		for(String s: types){
			ArrayList<Zone> zones = new ArrayList<Zone>();
			zooChart.put(s, zones);
		}
			
	}
}
