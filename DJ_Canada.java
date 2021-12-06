/*	Name:	Dejun Jackson
	Current date: 2/9/2020
	Sources Counsulted: Wikipedia; 10mosttoday.com; Google Maps
By submitting this work, I attest that it is my orginal work and that I did not violate the University of Mississippi academic policies set forth in the M book. 
*/
import java.util.Scanner;
public class DJ_Canada {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, this program is meant to equip you with important knowledge for your trip to Canada");
		System.out.println();
		System.out.println("The capital of Canada is Ottawa.");
		System.out.println();
		System.out.println("Canada has 10 provinces: Ontario, Quebec, Nova Scotia, New Brunswick, Manitoba, British Columbia, Prince Edward Island, Saskatchewan, Alberta, and Newfoundland and Labrador");
		System.out.println("Canada has 3 territories: Northewest Territories, Yukon, and Nunavut");
		System.out.println("The least populated province is Prince Edward Island, and the least populated territory is Nunavut");
		System.out.println();
		System.out.println("Next is a list of 5 Canadian animals to avoid because of how deadly they are!");
		System.out.println("First is the moose, because of its huge stature and tendency to charge and attack vehicles!");
		System.out.println("Next is the Black Widow, because of its venomous bite.");
		System.out.println("Third is the Prairie rattlesnake, because it can cause severe organ damage with its bite.");
		System.out.println("Next to last is the cougar. The cougar is the 2nd heaviest cat in the world, and it can be very hard to fend off its big claws and tremendous strength!");
		System.out.println("Finally, if you are camping, beware of the black bear. They can be 4x larger than a man, and are well equipped with razor sharp claws and a devastating bite!");
		System.out.println();
		System.out.println("The official unit of speed in Canada is kilometers per hour!");
		System.out.println();
		System.out.println("The official language of Quebec is French!");
		System.out.println();
		final double liters = 3.78541;
		// liters is the number of liters in a gallon
		System.out.println("What is the average cost of a liter of unleaded gas in Canada?");
		double costOfGas = keyboard.nextDouble();
		// costOfGas is the cost of a liter of unleaded gas in Canada
		double gallonOfGas = costOfGas*liters;
		// calculates the cost of a gallon of gas
		System.out.println("The cost of a gallon of unleaded gas in Canada is " + gallonOfGas);
		System.out.println("What is the exchange rate of a US dollar and a Canadian dollar?");
		double exchangeRate = keyboard.nextDouble();
		// exchangeRate is the exchange rate of US & Canadian dollar
		System.out.println("If you exchange 50 US dollars to Canadian money, your total is " + 50*exchangeRate);
		System.out.println("If you exchange 100 US dollars to Canadian money, your total is " + 100*exchangeRate);
		System.out.println("If you exchange 500 US dollars to Canadian money, your total is " + 500*exchangeRate);
		System.out.println("What is your first name?");
		String firstName = keyboard.next();
		int count = firstName.length();
		// count stores the lenght of user's first name
		System.out.println("The number of letters in your first name is " + count);
		System.out.println("Your first name in all caps is " + firstName.toUpperCase());
		System.out.println();
		System.out.println("The driving distance in km from Vancouver, BC to Niagara Falls, Ontario is 4,390.6. In miles, the distance is 2,708 miles.");
		System.out.println("What is the temperature in Celsius?");
		int C = keyboard.nextInt();
		// C stores degrees in Celsius
		double CtoF = C*1.8+32;
		// CtoF converts Celsius to Fahrenheit
		System.out.println("The temperature in Fahrenheit is " + CtoF);
		System.out.println("Hope this helps, see ya " + firstName + "!");
	}
}