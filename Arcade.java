import java.util.Scanner;
public class Arcade{
	public static void main (String[] args){
	Scanner keyboard = new Scanner(System.in);

System.out.println("Welcome to our Program");
System.out.println("Please enter the number of hours you have worked or -1 to quit");
int hoursWorked = keyboard.nextInt();
int totalHours = 0;
while(hoursWorked != -1){
	totalHours += hoursWorked;
	System.out.println("'Enter any additional hours worked or -1 to quit");
	int additionalHours = keyboard.nextInt();
	hoursWorked = additionalHours;
}
int coins = totalHours * 2;

for(int i = 1; i <= coins; i++){
	System.out.println("*CLINK* goes coin # " + i);
}
System.out.println("The amount of coins you are taking to the arcade is " + coins);
boolean enoughMoney = true;
do {
	System.out.println("Enter how many coins the game you want to play costs: ");
	int cost = keyboard.nextInt();
	if (cost <= coins){
		coins -= cost;
		System.out.println("Enjoy! Your remaining coin balance is " + coins);
	}	
	else 
		System.out.println("Sorry! You do not have enough coins to play this game. Try another.");
	if (coins == 0){
		enoughMoney = false;
	}
}while(enoughMoney == true);
System.out.println("Thank you for using. Goodbye.");
	
	}	
}