package day26_ARRAY_PART3;

public class length {

	public static void main(String[] args) {
int[][] numbers= {{1,2,3,4},{5,6},{7,20,90,30,45}};
System.out.println(numbers.length);
for (int i=0;i<numbers.length;i++) {
	System.out.println("the number of columns in the row is "+i+"is "+numbers[i].length);
}
for (int i=0;i<numbers.length;i++) {
	for(int j=0;j<numbers[i].length;j++) {
		System.out.println(numbers[i][j]);
	}
}
	}

}
