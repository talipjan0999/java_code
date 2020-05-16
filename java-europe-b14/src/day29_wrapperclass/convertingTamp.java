package day29_wrapperclass;

public class convertingTamp {

	public static void main(String[] args) {
String s="today where is sunny and 89 degree.it is perfect day for practice java";
String[] str=s.split("and");
str=str[1].split("degree");

String degree=str[0];
double degreeF=Double.parseDouble(degree);
double degreec=(degreeF-32)*5/9;


System.out.println(degreeF+"degree is equal to "+Math.round(degreec)+"ceilus");
	}

}
