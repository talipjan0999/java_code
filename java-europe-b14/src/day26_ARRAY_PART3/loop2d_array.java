package day26_ARRAY_PART3;

public class loop2d_array {

	public static void main(String[] args) {
		int[][] numbers= {{1,2,3,4},{5,6},{7,20,90,30,45}};
		for (int row=0;row<numbers.length;row++) {
			System.out.println("the number of columns in the row is "+row+"is "+numbers[row].length);
		}
		for (int row=0;row<numbers.length;row++) {
			for(int column=0;column<numbers[row].length;column++) {
				System.out.println(numbers[row][column]);
		
	}
}
	}

}
