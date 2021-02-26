package ZooManagement;

public class Main {	
	public static void main(String[] args){	
		String[] types = {"Bird","Reptile","Mammal"};
		Zoo zoo = new Zoo(types);
		Animal animal = new Lion("King","Mammal",12,10);
		System.out.println(zoo.addAnimal(animal));
		
	}
}
