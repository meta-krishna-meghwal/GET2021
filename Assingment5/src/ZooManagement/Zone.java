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

	public boolean isFull() {
		if(numberOfCagesCreated < numberOfCagesAllowed)
			return false;
		return true;
	}

	public Cage getCage() {
		Cage cage = cageList.get(numberOfCagesCreated - 1);
		return cage;
	}

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
