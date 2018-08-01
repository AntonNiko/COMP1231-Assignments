//*******************************************************************
// Parade.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 4
// ADT (Abstract Data Type) which is used to manage the clowns in a parade. 
// The class is structured such that a new clown is placed at the "end" of 
// the parade, and only the clown at the "front" of the parade can be removed. 
// Uses ArrayList.
//*******************************************************************
import java.util.ArrayList;

public class Parade {
	// Parade class implements ArrayList to manage clown objects
	ArrayList<Clown> paradeList;
	
	public Parade()
	{
		paradeList = new ArrayList<Clown>();
	}
	
	//-------------------------------------------------------------
	// Outputs the class name, and the name of the clown used at 
	// initialization
	//-------------------------------------------------------------
	public void addClown(String clown_name)
	{
		System.out.println("Adding clown: "+ clown_name);
		paradeList.add(0, new Clown(clown_name));
	}
	
	//-------------------------------------------------------------
	// Outputs the class name, and the name of the clown used at 
	// initialization
	//-------------------------------------------------------------
	public Clown removeClown()
	{
		System.out.println("Removing clown: "+ paradeList.get(paradeList.size()-1).getName());
		return paradeList.remove(paradeList.size()-1);
	}
	
	//-------------------------------------------------------------
	// Simply returns the size of the ArrayList implementation
	//-------------------------------------------------------------
	public int getParadeSize()
	{
		return paradeList.size();
	}
	
	//-------------------------------------------------------------
	// Outputs the name of each clown, starting from the end to the
	// front of the parade.
	//-------------------------------------------------------------
	public void printArrayList()
	{
		System.out.print("(Parade end) | ");
		for(int i=0; i<paradeList.size(); i++)
		{
			System.out.print(paradeList.get(i)+" | ");
		}
		System.out.println(" (Parade front)");
	}
}
