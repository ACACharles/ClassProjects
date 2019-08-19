import java.util.Scanner;
class DiceRoll extends DiceMath{
	public static void main (String[]args){
		
		Scanner input = new Scanner ( System.in );
		
		System.out.print( "Enter number of sides: ");
		int sides = input.nextInt();
		
		DiceMath dice = new DiceMath();
		
		System.out.print ( "Enter number of dice to roll: " );
		int numberOfDice = input.nextInt();
		
		for ( int i = 0; i < numberOfDice; i++){
			
			int num = dice.diceNum(sides);
			
			System.out.println("Dice number " +  (i + 1) + " is: " + num);
		}
	}
}