package ZooManagement;

public abstract class Animal {
	String animalName;
	String animalType;
	String animalId;
	int animalHeight;
	int animalWeight;
	
	Animal(String name, String type, int weight,int height){
		animalName = name;
		animalHeight = height;
		animalWeight = weight;
		animalType = type;
	}
	
	
	abstract public String getSound();
	
	

}
