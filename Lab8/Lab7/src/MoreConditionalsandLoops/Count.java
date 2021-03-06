package MoreConditionalsandLoops;

	// ************************************************************
	// Count.java
	//
	// This program reads in strings (phrases) and counts the
	// number of blank characters and certain other letters
	// in the phrase.
	// ************************************************************
	import java.util.Scanner;
	public class Count
	{
	public static void main (String[] args)
	{
	String phrase;
	String done;// a string of characters
	int countBlank; // the number of blanks (spaces) in the phrase
	int countA;
	int countE;
	int countS;
	int countT;
	int length; // the length of the phrase
	char ch;
	Scanner scan = new Scanner(System.in);
	// Print a program header
	
	
	do {		
	System.out.println ();
	System.out.println ("Character Counter");
	System.out.println ();
	// Read in a string and find its length
	System.out.print ("Enter a sentence or phrase: ");
	phrase = scan.nextLine();
	length = phrase.length();
	// Initialize counts
	countBlank = 0;
	countA=0;
	countE=0;
	countS=0;
	countT=0;
	// a for loop to go through the string character by character

	

	for(int i = 0; i < phrase.length(); i++) 
	
	{
		if(phrase.charAt(i) == ' ')
		{
			countBlank++;
		}
	
		ch = phrase.charAt(i);
	

	switch (ch)
	{
	case 'a':
	case 'A':
		countA++;
			  break;
	case 'e':
	case 'E': 
		countE++;
			  break;
	case 's':
	case 'S': 
		countS++;
			  break;
	case 't':
	case 'T': 
		countT++;
			  break;
	
	
	}
	}
	
	// and count the blank spaces
	// Print the results
	System.out.println ("Number of blank spaces: " + countBlank
			+ "\nNumber A's: " + countA
			+ "\nNumber of E's: " + countE
			+ "\nNumber of S's: " + countS
			+ "\nNumber of T's: " + countT);
	
	System.out.println("To quit, type quit");
	done=scan.nextLine();
	
		}
		while(!done.equals("quit"));
	}
	}
	