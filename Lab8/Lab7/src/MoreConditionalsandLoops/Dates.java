package MoreConditionalsandLoops;

//************************************************************
//Dates.java
//
//Determine whether a 2nd-millennium date entered by the user
//is valid
//************************************************************
import java.util.Scanner;
public class Dates
{
public static void main(String[] args)
{
int month, day, year; //date read in from user
int daysInMonth = 1; //number of days in month read in
boolean monthValid, yearValid, dayValid; //true if input from user is valid
boolean leapYear; //true if user's year is a leap year
Scanner scan = new Scanner(System.in);
//Get integer month, day, and year from user
System.out.println("Please enter the month");
month = scan.nextInt();
System.out.println("Please enter the day");
day = scan.nextInt();
System.out.println("Please enter the year");
year = scan.nextInt();

//Check to see if month is valid
if(month >= 1 && month <= 12) {
	System.out.println("Month is valid");
	monthValid = true;
}

else {
	System.out.println("Invalid Month");
	monthValid = false;
	}


//Check to see if year is valid
if(year >= 1000 && year <= 1999) {	
	System.out.println("Year is valid");
	yearValid = true;
}
else {
	System.out.println("Year is not valid");
}

//Determine whether it's a leap year
if((year % 400 == 0)||(year % 4 == 0) && (year % 100 != 0 )) {
	System.out.println("It's a leap year!");
	leapYear = true;	
}
else {

//Determine number of days in month
if (month == 4 || month == 6 || month == 9 || month == 11) {
	daysInMonth = 30;
}
else if(month == 1 || month == 3 || month == 4
|| month == 5 || month == 7 || month == 8 || month ==10 || month == 12 ) {
	daysInMonth = 31;
}
	


else if (leapYear = true && month == 2)
{
	daysInMonth = 29;
		
}
	else if (leapYear = false && month == 2){
		daysInMonth = 28;
	}

if (daysInMonth != month) {
	System.out.println("Date is not valid");
}
else { 
	System.out.println ("Date is good!"); 
	}




//User number of days in month to check to see if day is valid
//Determine whether date is valid and print appropriate message
}
}
}
