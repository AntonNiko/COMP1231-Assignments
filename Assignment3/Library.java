//*******************************************************************
// Library.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 3
// Program which reads line by line book titles from an input file, cycles
// through each title and removes any duplicates from the array until
// only unique titles are left. Writes all the unique titles into an 
// output file in the same folder as input file.
//*******************************************************************
import java.io.*;
import java.util.ArrayList;

public class Library {
	//-------------------------------------------------------------
	// Performs the program's actions, including initializing a
	// BufferedWriter and BufferedReader to interact with input & output
	// files and cycling through each element to remove duplicates.
	//-------------------------------------------------------------
	public static void main(String[] args) throws IOException
	{
		// Name of input and output files
		String inputFile = "bookTitles.inp";
		String outputFile = "uniqueTitles.out";
		// Variable to store each title from input file
		String line;
		// Variable to store result if duplicate title found
		boolean duplicateFound = false;
		// ArrayList for titles from input file
		ArrayList<String> bookTitles = new ArrayList<String>();
		// Reader and Writer objects for input and output file
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		
		
		System.out.println("Program which removes duplicate titles from "+inputFile+
				           " and writes unique titles to "+outputFile+"\n");
		// Stores each book title in the array, including any duplicates
		while((line = br.readLine()) != null) bookTitles.add(line);
		// Close BufferedReader stream
		br.close();

		// Run through ArrayList and remove duplicates
		ArrayList<String> bookTitlesNew = new ArrayList<String>();
		for(int i=0; i<bookTitles.size(); i++)
		{
			for(int j=0; j<bookTitles.size(); j++)
			{
				// If elements are equal and not at the same index, flag as duplicate
				if((bookTitles.get(i).equals(bookTitles.get(j))) && i!=j)
				{
					duplicateFound = true;
				}
			}
			
			// Output current element and whether it is unique in the array
			System.out.println("Value at index "+i+": "+
								bookTitles.get(i)+"\nDuplicate?: "+duplicateFound+"\n");
			// Add element to new array if it is the only one in the array
			if(!duplicateFound) 
			{
				bookTitlesNew.add(bookTitles.get(i));
			} 
			// If the current element is a duplicate, replace it with 
			// "NA" in array to indicate a duplicate was stored at that index
			else{
				bookTitles.set(i, "NA");
				duplicateFound = false;
			}
		}
		
		// Convert ArrayList into String array that can be used to write to output file
		String[] bookTitlesFinal = bookTitlesNew.toArray(new String[bookTitlesNew.size()]);
		// Write each unique title into the output file
		for(String titleFinal: bookTitlesFinal)
		{
			bw.write(titleFinal);
			bw.newLine();
		}
		// Close BufferedWriter stream
		bw.close();
	}
}