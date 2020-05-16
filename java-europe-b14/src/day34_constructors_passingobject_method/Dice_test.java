package day34_constructors_passingobject_method;

public class Dice_test {

	public static void main(String[] args) {
		final int SIX_sides=6;
		final int twenty_sides=20;
		Dice sixdice=new Dice(SIX_sides);
		Dice twentyDice=new Dice(twenty_sides);
		rollDice(sixdice);
		rollDice(twentyDice);
	}
public static void rollDice(Dice d) {
	
		System.out.println("rolling a"+d.getsides()+"sided dice");
	d.roll();

	System.out.println("the dice value "+d.getValue());

}
}
