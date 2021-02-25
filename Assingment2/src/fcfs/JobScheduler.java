package fcfs;

public class JobScheduler {
	
	public int [][] processes;
	public int length;
	
	public JobScheduler(int [][] processes){
		this.processes = processes;	
		this.length = processes.length;
	}
	
	/**Method to calculate comppletion time  
	 * @return int[] */
	public int[] completionTime(){
		int [] completion = new int[this.length];
		
		int lastExecutedTime=0; 
		for(int i=0;i<this.length;i++){
			
			if(this.processes[i][0] > lastExecutedTime)
			{
				lastExecutedTime = this.processes[i][0];
				
			}
			completion[i]=this.processes[i][1]+lastExecutedTime;
			lastExecutedTime+=this.processes[i][1];
		}
		
		return completion;
	}
	
	/**Method to calculate turn around time
	 * @return int[] */
	public int[] turnAroundTime()
	{
		int tatResult[]= new int[this.length];
		int lastExecutedTime=0;
		int completionTime;
		
		for(int i=0;i<this.length;i++)
		{
			if(this.processes[i][0]>lastExecutedTime)
			{
				lastExecutedTime=this.processes[i][0];
				
			}
			completionTime=this.processes[i][1]+lastExecutedTime;
			lastExecutedTime+=this.processes[i][1];
			tatResult[i]=completionTime-this.processes[i][0];
			
		}
		
		return tatResult;
		
	}
	
	/**Method to calculate waiting time
	 * @return int[] */
	public int[] waitingTime()
	{
		int waitingTimeResult[]=new int[this.length];
		int lastExecutedTime=0;
		int TurnAroundTime;
		int completionTime;
		for(int i=0;i<this.length;i++)
		{
			if(this.processes[i][0]>lastExecutedTime)
			{
				lastExecutedTime=this.processes[i][0];
				
			}
			completionTime=this.processes[i][1]+lastExecutedTime;
			lastExecutedTime+=this.processes[i][1];
			TurnAroundTime=completionTime-this.processes[i][0];
			waitingTimeResult[i]=TurnAroundTime-this.processes[i][1];
			
		}
		
		return waitingTimeResult;
		
	}
	
	/**Method to calculate average waiting time
	 * @return int[] */
	public int averageWaitingTime()
	{
		int avgwait;
		int totalwait=0;
		int waitArray[]= this.waitingTime();
		for(int x:waitArray)
		{
			totalwait+=x;
		}
		
		avgwait=totalwait/this.length;
		
		return avgwait;	
	}
	
	/**Method to calculate maximum waiting time
	 * @return int[] */
	public int MaxWaitingTime()
	{
		int MaxWait=0;
		int waitArray[]= this.waitingTime();
		for(int x:waitArray)
		{
			MaxWait=Math.max(MaxWait, x);
		}
		
		return MaxWait;
		
	}
	
	

}
