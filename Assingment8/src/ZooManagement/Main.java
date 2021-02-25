package ZooManagement;

public class Main {
	static String[] types = {"Bird","Reptile","Mammal"};
	
	public static void main(String[] args){		
		Zoo zoo = new Zoo(types);
		
		Animal animal = new Lion("King","mammals",12,10);
		System.out.println(zoo.addAnimal(animal));
		
	}
}
