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
	   
String one = "    _______\n"+"  /\\       \\\n"+" /()\\  (1)  \\\n"+"/    \\_______\\\n"+"\\    /()     /\n"+" \\()/   ()  /\n"+"  \\/_____()/";
/*  
String two = "    _______            
  /\\       \\           
 /()\\  (2)  \\          
/    \\_______\\         
\\    /()     /         
 \\()/   ()  /          
  \\/_____()/";
  
String three  = "    _______            
  /\\       \\           
 /()\\  (3)  \\          
/    \\_______\\         
\\    /()     /         
 \\()/   ()  /          
  \\/_____()/";
  
String four  = "    _______            
  /\\       \\           
 /()\\  (4)  \\          
/    \\_______\\         
\\    /()     /         
 \\()/   ()  /          
  \\/_____()/";
  
String five  = "    _______            
  /\\       \\           
 /()\\  (5)  \\          
/    \\_______\\         
\\    /()     /         
 \\()/   ()  /          
  \\/_____()/";
  
String six  = "    _______            
  /\\       \\           
 /()\\  (6)  \\          
/    \\_______\\         
\\    /()     /         
 \\()/   ()  /          
  \\/_____()/";
 */ 
		System.out.print( "Enter number of sides: ");
		int sides = input.nextInt();
		
		DiceMath dice = new DiceMath();
		
		System.out.print ( "Enter number of dice to roll: " );
		int numberOfDice = input.nextInt();
		
		System.out.println(dicePIC);
		
		for ( int i = 0; i < numberOfDice; i++){
			
			int num = dice.diceNum(sides);
			String justTheDice = "Dice number " +  (i + 1) + " is: " + num;
			System.out.println(dice.dicePIC(num));

//          output for one dice 
//			System.out.println(num==1?one:justTheDice);
//			System.out.println("Dice number " +  (i + 1) + " is: " + num);
		}
		
		System.out.println(dicePIC);
	}
	
	
}