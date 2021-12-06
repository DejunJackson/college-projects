import java.util.Scanner;
public class DecisionStructures {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Hello, welcome to the Blackjack helper");
		System.out.println("Please enter your name");
		String name = keyboard.nextLine();
		int score = 0;
		System.out.printf("Okay %s, please enter the value of the first card you drew:", name);
		int value1 = keyboard.nextInt();
		score += value1; 
		System.out.printf("Okay %s, please enter the value of the second card you drew:", name);
		int value2 = keyboard.nextInt();
		score += value2;
		if (score == 21){
			System.out.println("Blackjack!");
		}
		else if (score >= 12 && score <= 20){
			System.out.println("Risky to draw another card");
		}
		else if (score >= 2 && score <= 11){
			System.out.println("Safe to draw another card");
		}
		else{
			System.out.println("BUST");
		}
		System.out.println("Goodbye " + name); 
		System.out.println("Welcome!");
		System.out.println("Please enter a three digit area code.");
		int area = keyboard.nextInt();
		switch (area){ 
			case 228:
			case 601:
			case 662:
					System.out.println("This is a Mississippi area code.");
					break;
			case 205:	
			case 251:
			case 334:
			case 938:
					System.out.println("This is an Alabama area code.");
					break;
			case 479:
			case 501:
			case 870:
					System.out.println("This is an Arkansas area code.");
					break;
			default: 
					System.out.println("This is not a Mississippi, Alabama, or Arkansas area code.");
		}
		System.out.println("Goodbye");
	}
}
		

	
	
	