package day5.uniray_relational_operator;

public class mixedinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i1=5;
int i2=10;
float f1=50.5f;
double d1=20.5;
double  res1=i1+i2; //or we can put int
float res2=i1+f1; //or double
double res3=i2+d1;
short firstNumber=10;
short secondNumber=20;
int thirdNumber=firstNumber+secondNumber; /* when values of the short and byte datatypes are used in 
arthimetic expression,they are temporarly convert to //int values; */
short  thirdNumber2=(short)(firstNumber+secondNumber);
// example byte b1=20;
//        byte b2=2;
//          byte b3=(byte)(b1*b2);
int b1=20;
int b2=30;
byte b3=(byte)(b1*b2);

	}

}
