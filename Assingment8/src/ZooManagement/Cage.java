package ZooManagement;

import java.util.ArrayList;

public class Cage {
	private ArrayList<Animal> animalList = new ArrayList<Animal>(); 
	private int numberOfAnimalAdded = 0;
	private int numberOfAnimalsAllowed = 10;
	
	/**Method to check if a cage is full
	 * @return boolean */
	public boolean isCageFull() {
		if(numberOfAnimalAdded == numberOfAnimalsAllowed)
			return true;
		
		return false;
	}
	/**Method to add an animal to a cage
	 *  @param Animal */
	public void addAnimal(Animal animal) {
		if(!isCageFull()){
			numberOfAnimalAdded++;
			animalList.add(animal);
		}
		
	}

}
