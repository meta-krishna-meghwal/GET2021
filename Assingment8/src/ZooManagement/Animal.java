package ZooManagement;

public abstract class Animal {
	String animalName;
	String animalType;
	int animalId;
	int animalHeight;
	int animalWeight;
	
	Animal(String name, String type, int weight,int height){
		animalName = name;
		animalHeight = height;
		animalWeight = weight;
		animalType = type;
		animalId= (int) (Math.random()* 1000);
	}
	
	
	abstract public String getSound();
	
	

}
