import java.util.Random;
class DiceMath{
	int diceNum(int sides){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(sides) + 1;
		//return randomInt;
		return randomInt;
	}
}