//*******************************************************************
// Driver.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 4
// Program which demonstrates the use of the BoxDrawer class to add
// 5 names to an array, then 5 numbers to represent positions, such
// as table seats for example. Draws the names and numbers in a random 
//fashion, and outputs the results at the end of the draws.
//*******************************************************************
import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args)
	{
		// Objects for the people and numbers to be stored in
		BoxDrawer<String> peopleBox = new BoxDrawer<String>();
		BoxDrawer<Integer> numberBox = new BoxDrawer<Integer>();
		// ArrayLists for the draw results of each box
		ArrayList<String> drawPeople = new ArrayList<String>();
		ArrayList<Integer> drawNumbers = new ArrayList<Integer>();
		
		// Adding the names of 5 people (such as dinner guests for example)
		System.out.println("Adding names to Box 1:");
		peopleBox.add("Andreas");
		peopleBox.add("Reuben");
		peopleBox.add("Tommy");
		peopleBox.add("Lorraine");
		peopleBox.add("Johnny");
		System.out.println(peopleBox);
		
		// Adding 5 numbers (Can represent 5 table positions to be assigned for example)
		System.out.println("Adding numbers to Box 2:");
		numberBox.add(1);
		numberBox.add(2);
		numberBox.add(3);
		numberBox.add(4);
		numberBox.add(5);
		System.out.println(numberBox);
		
		
		// Draw the names of 5 people
		System.out.println("Drawing the 5 names...");
		while(!peopleBox.isEmpty())
		{
			drawPeople.add(peopleBox.drawItem());
		}
		// Draw the 5 numbers in a random fashion
		System.out.println("Drawing the 5 numbers... ");
		while(!numberBox.isEmpty()) 
		{
			drawNumbers.add(numberBox.drawItem());
		}
		
		// Output the corresponding index values for the names and numbers drawn
		System.out.println("Draw results:");
		for(int i=0; i<drawPeople.size(); i++)
		{
			System.out.println("Name: "+drawPeople.get(i)+"  |  Place: "+drawNumbers.get(i));
		}
		
		
	}
}
