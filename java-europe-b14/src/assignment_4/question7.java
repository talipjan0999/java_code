package assignment_4;

public class question7 {

	public static void main(String[] args) {
int second;
double minute,hour,day;
second=110;
minute=second/60;
hour=second/3600;
day=second/86400;
//minute=minute-second/60;
//hour=hour-second/3600;
//day=day-second/86400;
if (second>=0 && second<60) {System.out.println(second+"second");
	}
else if (second>=60) {minute=second/60;
hour=second/3600;
day=second/86400;
	System.out.println(second +"  second is equal to  "+minute+"  minute,"+hour +"  hour ,"+day +"   day.");
	}
}
	
}
