package assignment5;

public class question1 {

	public static void main(String[] args) {
int  numberOfBedrooms_variable=6;
double startingPrice_variable=0;

if(numberOfBedrooms_variable==1)
{
    
    startingPrice_variable=1100;
    System.out.println("One Bedroom Selected"+ "price is "+startingPrice_variable);
}
else if(numberOfBedrooms_variable==2)
{
    
    startingPrice_variable=1850;
    System.out.println("two Bedroom Selected"+"price is "+startingPrice_variable);
}
else if(numberOfBedrooms_variable==3)
{
    
    startingPrice_variable=2550;
    System.out.println("theree Bedroom Selected"+"price is "+startingPrice_variable);
}
else
System.out.println("No such Bedrooms available"+"startingPrice_variable is"+startingPrice_variable);
}

	}