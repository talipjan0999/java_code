package assignment_4;

public class question11 {

	public static void main(String[] args) {
String  medium="air";


double Distance,Timewater,Timesteel;
double Timeair;
Distance=1100;
Timeair=Distance/1100;
Timewater=Distance/4900;
Timesteel=Distance/16400;
switch (medium){
case "air":
	
	System.out.println("the time it take in air:"+Timeair);	
break;
case "water":
	
	System.out.println("the time it take in air:"+Timewater);	
break;
case "steel":
	
	System.out.println("the time it take in air:"+Timesteel);	
break;
}
	}

}
