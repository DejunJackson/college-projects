import java.util.Scanner;
import java.util.Random;
public class DJ_ThirtySix{
	public static void main (String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	Random random = new Random();
	
	System.out.println("Hello, and welcome to the Dice table of FUN!");
	System.out.println();
	
	System.out.println("Roll two dice over and over to get as close to 36 without going over. If you go over 36, then you lose.");
	System.out.println("The Computer will roll as well, and if it goes over 36, it loses. If neither of you go over 36, the one that rolls the highest wins.");
	System.out.println("The Computer will only roll if its total is under 30.");
	System.out.println();
	
	System.out.println("Enter your name.");
	String name = keyboard.nextLine();
	
	System.out.println();	
	System.out.println("Ready. Set. GO!");
	int gamesPlayed = 0;
	int playerWins = 0;
	int ties = 0;
	int playerLosses = 0;
	char letter = 'y';
	int playerTotal = 0;
	int comTotal=0;
	System.out.println();
 while(letter == 'y' || letter == 'Y' ){
	 
		int num1 = random.nextInt(6)+1;					// loop for player's score
		int num2 = random.nextInt(6)+1;
		int playerSum = num1 + num2;
		playerTotal += playerSum;
		System.out.println("You rolled a " + num1 + " and a " + num2);
		System.out.println("Your total is " + playerTotal);
		System.out.println();
		
		if (comTotal < 30){       //statement for the computer's score
		int comNum1 = random.nextInt(6)+1;
		int comNum2 = random.nextInt(6)+1;
		int comSum = comNum1 + comNum2;
		comTotal += comSum;
		}
		
		if (playerTotal > 36){					//if player goes over 36
			System.out.println("You went over 36 " + name + " ,you lose!!");
			gamesPlayed ++;
			playerLosses ++;			
			System.out.println("Do you want to play again? y/n?");
			letter = keyboard.nextLine().charAt(0);
			if (letter == 'Y' || letter == 'y'){
				playerTotal = 0;
				comTotal = 0;
				continue;
				
			}
			else if (letter == 'N' || letter == 'n'){
				System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
				}
			}
		}
		
		 else if (playerTotal == 36){						// if player hits 36
			System.out.println("You hit 36! You win " + name + "!");
			gamesPlayed ++;
			playerWins ++;
			System.out.println("Do you want to play again? y/n?");
			letter = keyboard.nextLine().charAt(0);
			if(letter == 'Y' || letter == 'y'){
				playerTotal = 0;
				comTotal = 0;
				continue;
				
			}
			else if (letter == 'N' || letter == 'n'){
				System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
				}
			}
			}
			else if (comTotal == 36){				// if computer hits 36
			System.out.println("The computer hit 36! You lose " + name + "!");
			gamesPlayed ++;
			playerLosses ++;
			System.out.println("Do you want to play again? y/n?");
			letter = keyboard.nextLine().charAt(0);
			if(letter == 'Y' || letter == 'y'){
				playerTotal = 0;
				comTotal = 0;
				continue;
				
			}
			else if (letter == 'N' || letter == 'n'){
				System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
				}
			}
			}
			else if (comTotal >36){							// if computer goes over 36
			System.out.println("The computer went over 36! You win " + name + "!");
			gamesPlayed ++;
			playerWins ++;
			System.out.println("Do you want to play again? y/n?");
			letter = keyboard.nextLine().charAt(0);
			if(letter == 'Y' || letter == 'y'){
				playerTotal = 0;
				comTotal = 0;
				continue;
				
			}
			else if (letter == 'N' || letter == 'n'){
				System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
				}
			}
			}
			System.out.println("Do you want to roll again? y/n?");
			letter = keyboard.nextLine().charAt(0);
			
			if (letter == 'N' || letter == 'n'){			//if player chooses not to roll again, mid game, the logic below compares scores for the current game
				if (comTotal < playerTotal){				// if player score is greater
				System.out.println("The computer's score is lower than yours, so you win " + name + "!");
				gamesPlayed ++;
				playerWins ++;
				System.out.println("Do you want to play again? y/n?");
				letter = keyboard.nextLine().charAt(0);
				if(letter == 'y' || letter == 'Y'){
					playerTotal = 0;
					comTotal = 0;
					continue;
				}
				if(letter == 'n' || letter == 'N'){
					System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
				}
					
				}
				}
				else if (comTotal > playerTotal){			// if computer score is greater
				System.out.println("The computer's score is higher than yours, so you lose " + name + "!");
				gamesPlayed ++;
				playerLosses ++;
				System.out.println("Do you want to play again? y/n?");
				letter = keyboard.nextLine().charAt(0);
				if(letter == 'y' || letter == 'Y'){
					playerTotal = 0;
					comTotal = 0;
					continue;
				}
				else if(letter == 'n' || letter == 'N'){
					System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
				}
				}
				
		}
				else if (comTotal == playerTotal){				// if there is a tie
				System.out.println("It's a tie " + name + "!");
				gamesPlayed ++;
				ties ++;
				System.out.println("Do you want to play again? y/n?");
				letter = keyboard.nextLine().charAt(0);
				if(letter == 'y' || letter == 'Y'){
					playerTotal = 0;
					comTotal = 0;
					continue;
				}
				else if(letter == 'n' || letter == 'N'){
					System.out.println("Game over. See ya " + name);
				System.out.println();
				System.out.println("Number of games played: " + gamesPlayed);
				System.out.println("Number of games you won: " + playerWins);
				System.out.println("Number of the computer wins: " + playerLosses);
				System.out.println("Number of games tied: " + ties);
				if (playerWins > playerLosses){
					System.out.println("GOODJOB YOU WIN!");
					System.out.println("Now go do something constructive with your life " + name + ".");
				}
				else if (playerLosses > playerWins){
					System.out.println("The computer rigged the game!");
					System.out.println("Computers are taking over!");
				}
				else if (playerLosses == playerWins){
					System.out.println("WOW! It's a tie?!");
 }
				
					
			}

}
 }
 }
	}
}
