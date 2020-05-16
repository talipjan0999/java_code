package day26_ARRAY_PART3;

public class _Array_2d {

	public static void main(String[] args) {
int [][] scores=new int [3][7];
System.out.println(scores);
System.out.println(scores[2]);
System.out.println(scores[1][2]);

scores[0][1]=10;
scores[1][0]=11;
scores[0][2]=1;
scores[0][3]=3;
scores[0][4]=5;
scores[0][5]=6;
scores[0][6]=10;
scores[0][1]=44;

System.out.println(scores);



	}

}
