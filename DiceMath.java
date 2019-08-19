//Importing Random class
import java.util.Random;

// Create DICE MATH class 
class DiceMath{
	
	//dice num ---- RETURNS int / PARAMETES number of SIDES
	int diceNum(int sides){

		//CREATE instance of RANDOM
		Random randomGenerator = new Random();

		// This could have returned the value directly
		// return = randomGenerator.nextInt(sides) + 1;
		int randomInt = randomGenerator.nextInt(sides) + 1;
		
		//return randomInt;
		return randomInt;
	}
	
	String dicePIC (int number){
		int diceVALUE = number;
		String one = "";
		
		switch (number)
		{
//			case number < 10;
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:			
			one = "    _______\n"+"  /\\       \\\n"+" /()\\  ("+diceVALUE+")  \\\n"+"/    \\_______\\\n"+"\\    /()     /\n"+" \\()/   ()  /\n"+"  \\/_____()/";
			break;
			default:
			one = "    _______\n"+"  /\\       \\\n"+" /()\\ ("+diceVALUE+")  \\\n"+"/    \\_______\\\n"+"\\    /()     /\n"+" \\()/   ()  /\n"+"  \\/_____()/";
			break;
		}
		return one;
	}
}