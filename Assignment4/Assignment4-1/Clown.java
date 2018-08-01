//*******************************************************************
// Clown.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 4
// Class which is used to represent each clown that is inserted and removed
// from the parade class. The only property of this class is the clown's 
// name, as well as setter & getter name methods, and overriden toString()
// to display useful information relating to each clown
//*******************************************************************

public class Clown {
	private String name;
	
	public Clown(String clown_name)
	{
		name = clown_name;
	}
	
	// Getter for clown's name
	public String getName()
	{
		return name;
	}
	
	// Setter for clown's name
	public void setName(String clown_name)
	{
		name = clown_name;
	}
	
	//-------------------------------------------------------------
	// Outputs the class name, and the name of the clown used at 
	// initialization
	//-------------------------------------------------------------
	public String toString()
	{
		return "Clown [name=" + getName() + "]";
	}
}
