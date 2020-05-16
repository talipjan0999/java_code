package assignment_4;

public class question13 {

	public static void main(String[] args) {
		int check=40;
		double fee;
		if (check<=20) {
			fee=10+check*0.1;
			System.out.println(" fee="+fee);
		}
		else if(check>20 && check<39) {
			fee=10+check*0.08;
			System.out.println(" fee="+fee);}
			else if (check>=40 && check<59) {
				fee=10+check*0.06;
				System.out.println(" fee="+fee);
			}
			else if(check>=60){
				fee=10+check*0.04;
				System.out.println(" fee="+fee);
			}
			}
		}
	


