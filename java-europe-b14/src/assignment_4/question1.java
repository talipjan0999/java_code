package assignment_4;

public class question1 {

	public static void main(String[] args) {
		
		
double weight=150;
int feet=5;
int inches=5;
double height1=feet*12;
double BMI = (weight / (height1 * height1))*703;
String s1="Your risk factory is";
String s2="your BMI is";
String s3="Your weight in pounds ";
String s4="Your height in feet followed by a space then "
		+ "additional inches:";
if (BMI<18.5) {
	System.out.println(s3 + weight);
	System.out.println(s4 + feet +" "+inches);
	System.out.println(s1+ "Underweight");
System.out.println(s2+ BMI);
}
else if(BMI>=18.5 && BMI<25) {
	System.out.println(s3 + weight);
	System.out.println(s4 + feet +" "+inches);
	System.out.println(s1+"Normal Weight");
	System.out.println(s2+ BMI);
	}
	else if (BMI>=25 && BMI<30) {
		System.out.println(s3 + weight);
		System.out.println(s4 + feet +" "+inches);
		System.out.println(s1+" Overweight");
		System.out.println(s2+ BMI);
	}
		else if (BMI>=30){
			System.out.println(s3 + weight);
			System.out.println(s4 + feet +" "+inches);
			System.out.println("Obese");
		System.out.println(s2+ BMI);
		}
			
		}
	}




