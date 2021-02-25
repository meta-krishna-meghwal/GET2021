package ZooManagement;

import java.util.ArrayList;

public class Zone {
	
	private ArrayList<Cage> cageList = new ArrayList<Cage>(); 
	private String zoneType;
	private int numberOfCagesCreated = 0;
	private int numberOfCagesAllowed = 30;
	
	public Zone(String type) {
		zoneType = type;
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
		Cage cage = cageList.get(numberOfCagesCreated - 1);
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
