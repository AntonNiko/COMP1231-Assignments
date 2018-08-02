//*******************************************************************
// TextAnalyser.java            
//
// Anton Nikitenko T00622037
// COMP 1231 Assignment 5 Part 1
// TextAnalyser class which displays a window (using JFrame class), 
// and defines several GUI components such as the text area for user
// input, a separate section used to display the total and average 
// word count to the user, several labels and a button to execute 
// the analysis
//*******************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TextAnalyser extends JFrame implements ActionListener {
	// Input area for user
	private JTextArea inputField;
	private JScrollPane inputScroll;
	// Separate panel used for displaying results to user, and allow
	// custom visual border styling
	private JPanel resultsArea;
	// Labels to describe each visual component to the user
	private JLabel inputLabel, resultLabel, wordLengthLabel, averageLabel;
	private JTextField wordLengthResult, averageResult;
	// Button used to execute the calculations of the user's input
	private JButton buttonCompute;

	public TextAnalyser()
	{
		setLayout(new FlowLayout());
		
		// Label to describe input area
		inputLabel = new JLabel("Enter your text to be analyzed here: ");
		
		// Input TextArea for user input
		inputField = new JTextArea(5, 20);
		inputScroll = new JScrollPane(inputField);
		inputScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		// Separate section to display total word count and average word count
		resultsArea = new JPanel();
		resultsArea.setLayout(new FlowLayout());
		
		// Label to describe the results section
		resultLabel = new JLabel("Results will be displayed here");
		resultsArea.add(resultLabel);
		
		// Label to signal the total word length output
		wordLengthLabel = new JLabel("Word length: ");
		resultsArea.add(wordLengthLabel);
		
		// Total word length text output
		wordLengthResult = new JTextField("---", 5);
		wordLengthResult.setEditable(false);
		resultsArea.add(wordLengthResult);
		
		// Label to signal the average word length
		averageLabel = new JLabel("Average word length: ");
		resultsArea.add(averageLabel);
		
		// Average world length text output
		averageResult = new JTextField("---", 5);
		averageResult.setEditable(false);
		resultsArea.add(averageResult);	
		
		// Button to execute the calculations and display results to user
		buttonCompute = new JButton("Compute");
		buttonCompute.addActionListener(this);
		resultsArea.add(buttonCompute);
		
		// Create and set the border type for the result area (TitledBorder)
		resultsArea.setBorder(new TitledBorder("Calculation Results"));
		
		// Add the label, scrollable text area and results area
		add(inputLabel);
		add(inputScroll);
		add(resultsArea);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(650, 220));
		setTitle("Text Analyzer");
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// Since the only actionListener is the button used for computing the result,
		// directly processes calculations in this method
		Scanner inputScan = new Scanner(this.inputField.getText());
		DecimalFormat outputFormat = new DecimalFormat(".##");
		int wordCount = 0;
		int totalLetterCount = 0;
		double averageLetterCount;
		while(inputScan.hasNext())
		{
			// Increment wordCount for each word separated by a whitespace character
			wordCount++;
			totalLetterCount+=inputScan.next().length();
		}
		inputScan.close();
		
		// If no words were provided by the user (empty text area, display
		// message to user to alert them that no input was provided
		if(wordCount == 0)
		{
			JOptionPane.showMessageDialog(null, "No words were provided, please provide an input for the program");
			return;
		}
		
		// Calculating average word count
		averageLetterCount = (double) totalLetterCount / (double) wordCount;
		// Change the text of each corresponding text output component to display calculation 
		// results to the user
		this.wordLengthResult.setText(outputFormat.format(wordCount));
		this.averageResult.setText(outputFormat.format(averageLetterCount));		
		
	}
}
