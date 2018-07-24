//*******************************************************************
// Average.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 3
// Program which prompts the user to input 10 integers , and calculate & 
// and output the average of these numbers. If input is invalid, throws 
// exception and prompts user a valid integer again. 
//*******************************************************************
import java.util.Scanner;

public class Average {
	//-------------------------------------------------------------
	// Performs the program's actions, including initializing an input 
	// Scanner object, reading values, and handling exceptions if the 
	// input does not properly convert to an integer. 
	//-------------------------------------------------------------
	public static void main(String[] args)
	{
		// Variables to store sum when calculating average, 
		// final result and the user input for each integer
		int averageSum;
		double averageResult;
		String scannerInput;
		
		// Initializes Scanner as well as memory for array of 10 integers
		Scanner sysInput = new Scanner (System.in);
		int[] input = new int[10];
		
		System.out.println("Calculator that averages out the value of 10 integers...");
		for(int index=0; index<10; index++)
		{
			// Program will continue prompting a valid input, at which point it breaks from the 
			// while loop and  prompts for next integer
			while(true)
			{
				try
				{
					// Input integer, parseInt() will throw NumberFormatException if does not recognize integer input
					System.out.print("Input integer "+(index+1)+": ");
					scannerInput = sysInput.nextLine();
					input[index] = Integer.parseInt(scannerInput);
					break;
				}catch(NumberFormatException e1)
				{
					System.out.println("Invalid input, please enter an integer...");
				}				
			}
		}
		
		// Add all 10 integers, and calculate average that is stored in double variable
		averageSum = 0;
		for(int i=0; i<10; i++)
		{
			averageSum+=input[i];
		}
		averageResult = averageSum / 10.0;
		
		// Outputs the result
		System.out.println("The average of the 10 numbers is: " + averageResult);
		sysInput.close();
	}
}
