package fcfs;

public class Main {
	
	public static void main(String[] args){
		
		int [][] processes = {{0,5},{10,20},{21,10}};
		JobScheduler p = new JobScheduler(processes);
		
		int [] c = p.completionTime();
		
		for(int i:c){
			System.out.println(i);
		}

	}
}
