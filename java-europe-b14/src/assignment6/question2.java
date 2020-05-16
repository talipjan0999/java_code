package assignment6;

public class question2 {

	public static void main(String[] args) {		
	int num1=1,num2=-1,sum;
for(int i=0;i<10;i++) {
	
	sum=num1+num2;
	num2=num1;
	num1=sum;

	System.out.println(sum);
}
	}

}
