//*******************************************************************
// Task.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 2
// Represents a Task, such as a to-do list, and an associated property
// which ranks its priority in terms of completion. This priority
// property can be used to compare the relative importance of 2 tasks
//*******************************************************************
public class Task implements Priority, Comparable<Task> 
{
	// Variables for task objects to store description and its priority
	public String description;
	private int priority;
	

	// Method implemented by Priority interface
	public void setPriority(int priority) 
	{
		this.priority = priority;
	}

	// Method implemented by Priority interface
	public int getPriority() 
	{
		return this.priority;
	}

	// Method implemented by Comparable interface, with argument which 
	// allows comparison of class Type objects
	public int compareTo(Task argumentTask) 
	{
		if(this.priority > argumentTask.getPriority())
		{
			return 1;
		}else if(this.priority < argumentTask.getPriority())
		{
			return -1;
		}else
		{
			return 0;
		}
	}
	
}
