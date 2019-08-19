/* 
	Code hase been changed to no longer accept number of sides to dice.
	Default die has been set to D6.
	Now prints out a text art showing a die with the side value.
*/

//Importing Random class
import java.util.Random;

// Create DICE MATH class 
class DiceMathD6{
	
	//dice num ---- RETURNS int / PARAMETES number of SIDES
	int diceNum(){

		//CREATE instance of RANDOM
		Random randomGenerator = new Random();

		// This could have returned the value directly
		// return = randomGenerator.nextInt(sides) + 1;
		int randomInt = randomGenerator.nextInt(6) + 1;
		
		//return randomInt;
		return randomInt;
	}
}
