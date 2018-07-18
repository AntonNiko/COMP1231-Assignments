//*******************************************************************
// Driver.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 2
// Represents a Task, most likely a to-do list, and an associated property
// which ranks its priority in terms of completion. This priority
// property can be used to compare the relative importance of 2 tasks
//*******************************************************************
public class Driver 
{
	// Variables represent low, low/medium, medium, medium/high and high priority for comparison
	final static int LOW_PRIORITY = 1;
	final static int LOWMED_PRIORITY = 25;
	final static int MED_PRIORITY = 50;
	final static int MEDHIGH_PRIORITY = 75;
	final static int HIGH_PRIORITY = 100;
	
	public static void main(String[] args) 
	{
		Task[] task_array = new Task[6];
		int comparable_result;
		
		// Task 1 has low priority
		task_array[0] = new Task();
		task_array[0].description = "Task 1 description";
		task_array[0].setPriority(LOW_PRIORITY);
		// Task 2 has low/medium priority:
		task_array[1] = new Task();
		task_array[1].description = "Task 2 description";
		task_array[1].setPriority(LOWMED_PRIORITY);
		// Task 3 has medium priority:
		task_array[2] = new Task();
		task_array[2].description = "Task 3 description";
		task_array[2].setPriority(MED_PRIORITY);
		// Task 4 has medium/high priority:
		task_array[3] = new Task();
		task_array[3].description = "Task 4 description";
	    task_array[3].setPriority(MEDHIGH_PRIORITY);
		// Task 5 has high priority:
		task_array[4] = new Task();
		task_array[4].description = "Task 5 description";
		task_array[4].setPriority(HIGH_PRIORITY);
		// Task 6 has medium priority, and is used for comparison:
		task_array[5] = new Task();
		task_array[5].description = "Task 6 description";
		task_array[5].setPriority(MED_PRIORITY);
		
		// Cycle through Task 1 to 5, and output the comparisons
		for(int i=0; i < 5; i++)
		{
			// Stores the result of compareTo method of the task that is iterated
			comparable_result = task_array[i].compareTo(task_array[5]);
			
			// Prints the priority of both tasks being compared, and the result of compareTo method
			System.out.println("Task "+(i+1)+": "+task_array[i].getPriority()+
					           "  | Task 6: "+task_array[5].getPriority()+
					           "  | Comparable result: "+comparable_result);
			
			// Outputs corresponding message depending on the result of compareTo method
			switch(comparable_result)
			{
			    case(-1):
			    	System.out.println("Task "+(i+1)+" has lower priority than Task 6\n");
			        break;
			    case(0):
			    	System.out.println("Task "+(i+1)+" has the same priority as Task 6\n");
			        break;
			    case(1):
			    	System.out.println("Task "+(i+1)+" has higher priority than Task 6\n");
			        break;
			    default: 
			    	break;
			}
			
		}
		
		
	}
}
