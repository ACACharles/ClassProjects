/* 
	Code hase been changed to no longer accept number of sides to dice.
	Default die has been set to D6.
	Now prints out a text art showing a die with the side value.
*/

import java.util.Scanner;
class DiceRollD6 extends DiceMath{
	public static void main (String[]args){
		
		Scanner input = new Scanner ( System.in );
		
		String one =(" -------\r\n|       |\r\n|   o   |\r\n|       |\r\n -------");

		String two =(" -------\r\n| o     |\r\n|       |\r\n|     o |\r\n -------");
		
		String three =(" -------\r\n| o     |\r\n|   o   |\r\n|     o |\r\n -------");
		
		String four =(" -------\r\n| o   o |\r\n|       |\r\n| o   o |\r\n -------");
		
		String five =(" -------\r\n| o   o |\r\n|   o   |\r\n| o   o |\r\n -------");
		
		String six =(" -------\r\n| o   o |\r\n| o   o |\r\n| o   o |\r\n -------");
		
		
		/*System.out.print( "Enter number of sides: ");
		int sides = input.nextInt();*/
		
		DiceMath dice = new DiceMath();
		
		System.out.print ( "Enter number of dice to roll: " );
		int numberOfDice = input.nextInt();
		
		for ( int i = 0; i < numberOfDice; i++){
			
			int num = dice.diceNum();
			
			System.out.println("Dice number " +  (i + 1) + " is: " + num);
			if (num == 1)
				System.out.println(one);
			if (num == 2)
				System.out.println(two);
			if (num == 3)
				System.out.println(three);
			if (num == 4)
				System.out.println(four);
			if (num == 5)
				System.out.println(five);
			if (num == 6)
				System.out.println(six);
		}
	}
}
