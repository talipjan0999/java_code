package method_part_2;

public class tesk67 {

	public static void main(String[] args) {
if(lastdigit(700,17)) {System.out.println("have same last digit");
	}
      else {System.out.println("dont have same last digit");
	}
         }public static boolean lastdigit(int i, int j) {
		if (i%10==j%10) {
			return true;
		}else
		return false;
	}

}
