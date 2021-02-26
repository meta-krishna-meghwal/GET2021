package ZooManagement;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	
	private List<Cage> cageList = new ArrayList<Cage>(); 
	private String zoneType;
	private int numberOfCagesCreated = 0;
	private int numberOfCagesAllowed = 30;
	public int zoneId ;
	
	public Zone(String type) {
		zoneType = type;
		zoneId = (int)(Math.random()*1000);
	}
	/**Method to check if the zone is full
	 * @return boolean */
	public boolean isZoneFull(){
		if(numberOfCagesCreated == numberOfCagesAllowed){
			Cage cage = getCage();
			if(cage.isCageFull())
				return true;	
		}
		return false;
	}

	/**Method to get last cage added in the zone
	 * @return Cage */
	public Cage getCage() {
		Cage cage = null;
		if(cageList.size()!= 0){
			cage = cageList.get(numberOfCagesCreated - 1);
		}else{
			cage = addCage();
		}
		return cage;
	}
	
	/**Method to add a cage in the zone
	 * @return Cage */
	public Cage addCage() {
		
		Cage cage = null;
		if(numberOfCagesCreated < numberOfCagesAllowed){
			numberOfCagesCreated++;
			cage = new Cage();
			cageList.add(cage);
		}
		return cage;
	}


}
