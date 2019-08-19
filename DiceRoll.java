import java.util.Scanner;
class DiceRoll extends DiceMath{
	public static void main (String[]args){
		
		Scanner input = new Scanner ( System.in );
		
		String dicePIC = "test";

dicePIC = "              ________\n";
dicePIC +="             /\\       \\\n";
dicePIC +="            /  \\       \\\n";
dicePIC +="           /    \\       \\\n";
dicePIC +="          /      \\_______\\\n";
dicePIC +="          \\      /       /\n";
dicePIC +="        ___\\    /   ____/___\n";
dicePIC +="       /\\   \\  /   /\\       \\\n";
dicePIC +="      /  \\   \\/___/  \\       \\\n";
dicePIC +="     /    \\       \\   \\       \\\n";
dicePIC +="    /      \\_______\\   \\_______\\\n";
dicePIC +="    \\      /       /   /       /\n";
dicePIC +="     \\    /       /   /       /\n";
dicePIC +="      \\  /       /\\  /       /\n";
dicePIC +="       \\/_______/  \\/_______/    \n";
	   
		
		System.out.print( "Enter number of sides: ");
		int sides = input.nextInt();
		
		DiceMath dice = new DiceMath();
		
		System.out.print ( "Enter number of dice to roll: " );
		int numberOfDice = input.nextInt();
		
		System.out.println(dicePIC);
		
		for ( int i = 0; i < numberOfDice; i++){
			
			int num = dice.diceNum(sides);
			
			System.out.println("Dice number " +  (i + 1) + " is: " + num);
		}
		
		System.out.println(dicePIC);
	}
	
	
}