package day26_ARRAY_PART3;

public class scorecalculation_array2d {

	public static void main(String[] args) {
		int[][] studentsgrade={{1,2,3,4},{5,6},{7,20,90,30,45}};
int sum=0;

for(int column=0;column<studentsgrade[0].length;column++) {
	sum=sum+studentsgrade[0][column];
	System.out.println(sum);
}
System.out.println(sum/studentsgrade[0].length); 
	}

}
