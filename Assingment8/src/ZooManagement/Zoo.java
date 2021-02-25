package ZooManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
	
	HashMap<String, ArrayList<Zone>> zooChart = new HashMap<String, ArrayList<Zone>>();
	
	static final int noOfZones = 15;
	static  int numberOfZonesCreated = 0;
	
	
	/** Initialization of zooChart for each category 
	 * @param String[]  */
	public Zoo(String[] types){
		for(String s: types){
			ArrayList<Zone> zones = new ArrayList<Zone>();
			zooChart.put(s, zones);
		}
			
	}
	
	/** Method for adding an animal to the zoo
	 * @param Animal
	 * @return boolean*/
	
	public boolean addAnimal(Animal animal){
		
		String type = animal.animalType;	
		Zone zone = getZone(type);
		Cage cage = null;
		
		if(numberOfZonesCreated == noOfZones && zone.isZoneFull()){
			return false;
		}
		else{
			if(zone.isZoneFull()){
				zone = addZone(type);
			}	
			
			if(zone != null)
				cage = zone.getCage();	
			
			if( cage != null && cage.isCageFull()){
				cage = zone.addCage();
			}
			
			if(cage != null)
				cage.addAnimal(animal);
			
			return true;
		}
		
				
	}
	/** Method to add a zone in the zoo according to its category
	 * @param String
	 * @return Zone*/
	public Zone addZone(String type) {
		Zone zone = null;
		if(numberOfZonesCreated < noOfZones){
			numberOfZonesCreated++;
			zone = new Zone(type);
			zooChart.get(type).add(zone);
		}
		return zone;
	}

	/**Method to get a zone of a particular category 
	 * Returns last zone added
	 * @param String
	 * @return Zone*/
	
	public Zone getZone(String type){
		ArrayList<Zone> zones = zooChart.get(type);
		Zone zone = null;
		if(zones != null){
			zone = new Zone(type);
			zones.add(zone);
		}else{
			int lastZone = zones.size() - 1;
			zone = zones.get(lastZone);	
		}		
		return zone;	
	}

	
}
