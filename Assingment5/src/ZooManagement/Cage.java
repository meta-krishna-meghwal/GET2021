package ZooManagement;

import java.util.ArrayList;

public class Cage {
	private ArrayList<Animal> animalList = new ArrayList<Animal>(); 
	private int numberOfAnimalAdded = 0;
	private int numberOfAnimalsAllowed = 10;
	public boolean isFull() {
		if(numberOfAnimalAdded == numberOfAnimalsAllowed)
			return true;
		
		return false;
	}

	public void addAnimal(Animal animal) {
		if(!isFull()){
			numberOfAnimalAdded++;
			animalList.add(animal);
		}
		
	}

}
