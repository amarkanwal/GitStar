package MoreConditionalsandLoops;

import java.util.Scanner;
public class lazyDays {
	public static void main(String[] args){
		int temperature;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the current temperature:");
		temperature = scan.nextInt();

		
		if(temperature >=80) {
			System.out.println("Perfect day for a swim, don't bellyflop though");
		}
		
		if(temperature >= 60 && temperature >=80) {
			System.out.println("Go play some tennis, you need the cardio");
		}
		
		if(temperature >= 40 && temperature >=60) {
			System.out.println("Go play some golf, dont dig too many divets!");
		}
		
		if(temperature < 40 && temperature >=20) {
			System.out.println("Time for some Skiing! Fresh powdaaa!");
		}
		if(temperature >=95 || temperature < 20){
			System.out.println("You should go visit our shops!");
		}
			
	}
}
