//*******************************************************************
// Priority.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 2
// An interface which represents the properties and methods that will
// be implemented in a Task object. Includes 2 methods that set and 
// get the current priority of an instance of the class that implements
// Priority interface
//*******************************************************************
public interface Priority 
{
	// Variables represent low, low/medium, medium, medium/high and high priority for comparison
	final static int LOW_PRIORITY = 1;
	final static int LOWMED_PRIORITY = 25;
	final static int MED_PRIORITY = 50;
	final static int MEDHIGH_PRIORITY = 75;
	final static int HIGH_PRIORITY = 100;
	
	// Method to set or change priority, or return the current priority
	public void setPriority(int priority);
	public int getPriority();
}
