package ZooManagement;

import java.util.ArrayList;
import java.util.List;

public class Cage {
	private List<Animal> animalList = new ArrayList<Animal>(); 
	private int numberOfAnimalAdded = 0;
	private int numberOfAnimalsAllowed = 10;
	public int cageId;
	/**Method to check if a cage is full
	 * @return boolean */
	public Cage(){
		cageId = (int)(Math.random()*1000);
	}
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
