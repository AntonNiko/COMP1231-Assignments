//*******************************************************************
// BoxDrawer.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 4
// Class which functions as an Abstract Data Type (ADT), including
// adding elements of one type to an ArrayList, and provides functions
// to draw one of the elements at random, check if the array is empty,
// and return a string representation of the BoxDrawer object
//*******************************************************************

import java.util.Random;
import java.util.ArrayList;

public class BoxDrawer<T> {
	// ArrayList of generic type to store elements to be drawn
	private ArrayList<T> array;
	// Variable to store the result of each draw
	private T drawResult;
	// Random class to generate random values for each draw
	private Random rand = new Random();
	
	public BoxDrawer()
	{
		// Initialize the ArrayList before any elements are added
		array = new ArrayList<T>();
	}
	
	public void add(T element)
	{
		// Add the element to the initialized ArrayList
		System.out.println("Adding element: "+element);
		array.add(element);
	}
	
	public boolean isEmpty()
	{
		// Return true if the ArrayList is empty, esle return false
		if(array.size() == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public T drawItem()
	{
		// drawIndex for the result of random object draw
		int drawIndex;
		// If the ArrayList has been emptied, return null
		if(array.size() == 0)
		{
			return null;
		}
		// Generate the integer to be used as index for the element
		drawIndex = rand.nextInt(array.size());
		drawResult = array.get(drawIndex);
		// Remove the drawn element from the ArrayList to avoid
		// the same element being drawn
		array.remove(drawIndex);
		return drawResult;
	}
	
	public String toString()
	{
		// element information added to the string and 
		// returned when method is called
		String drawerString = "Box contents: | ";
		for(int i=0; i<array.size(); i++)
		{
			drawerString += array.get(i) + " | ";
		}
		drawerString+="\n";
		
		return drawerString;
	}
}
