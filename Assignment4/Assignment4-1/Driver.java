//*******************************************************************
// Driver.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 4
// Program which demonstrates the use of a Parade class, which accepts 
// clowns to be inserted and removed from a parade, and can print out 
// the contents of the parade
//*******************************************************************

public class Driver {
	public static void main(String[] args)
	{
		// Initialize new parade, with no clowns 
		Parade parade = new Parade();
		
		// Add clown with a specific name, places clown at end of parade
		parade.addClown("Jolly Rancher");
		parade.addClown("Anton Nikitenko");
		parade.addClown("Jubilee Ranch");
		parade.addClown("Vermicelli Antonio");
		
		System.out.print("\n");
		// Outputs the content of the parade class 
		parade.printArrayList();
		// Remove clowns (will remove the ones at front of parade)
		parade.removeClown();
		parade.removeClown();
		
		System.out.print("\n");
		parade.printArrayList();
		parade.addClown("Gobbly Wobbly");
		parade.addClown("Julius Ceasar Salad");
		parade.printArrayList();		
	}
}
