import java.util.Scanner;
public class UserInputProgram {
	public static void main (String [] args){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter your first name");
			String firstName = keyboard.nextLine();
			System.out.println("Please enter your last name");
			String lastName = keyboard.nextLine();
			String userName = (firstName + " " + lastName);
			System.out.println("Your name is " +  userName);
			int count = userName.length();
			System.out.println("The number of letters in your name is " + count);
			System.out.println("The first letter in your name is " + userName.charAt(0));
			System.out.println("Your name in Upper Case letters is " + userName.toUpperCase());
			
			
			final int CURRENT_YEAR = 2020;
			String Birthday = "1998";
			int convertNum = Integer.parseInt(Birthday);
			int Age = (CURRENT_YEAR - convertNum);
			System.out.println ("Your age is " + Age);
			int Random = 257484;
			String convertString = String.valueOf(Random);
			int number = convertString.length();
			System.out.println("The length of 257484 is " + number);
			int operate = 18;
			operate += 5;
			System.out.println("The value of operate += 5 is " + operate);
			operate -= 5;
			System.out.println("The value of operate -= 5 is " + operate);
			operate *= 5;
			System.out.println("The value of operate /= 5 is " + operate);
			operate %= 5;
			System.out.println("The value of operate %= 5 is " + operate);
			double max = 16.3;
			double powerNum = Math.pow(max, 3.0);
			System.out.printf("16.3 to the power of 3 is " + powerNum);
			double squareRT = Math.sqrt(max);
			System.out.printf("The square root of 16.3 is " + squareRT);
			System.out.printf("16.3 * PI is " + Math.PI * max);
			
			
			
			
		}
	}	
	
	