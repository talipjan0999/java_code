package day26_ARRAY_PART3;

public class raggedArray {

	public static void main(String[] args) {
int[][] array=new int[5][];
System.out.println(array[0]);
array[0]=new int[3];
array[1]=new int[4];
array[2]=new int[5];
array[3]=new int[6];
/*is same with following array */
int[][] array1= {{0,0,0},{0,0,0,0},{0,0,0,0,0},{0,0,0,0,0,0}};
System.out.println(array[0][2]);
	}

}
