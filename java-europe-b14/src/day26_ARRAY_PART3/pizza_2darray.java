package day26_ARRAY_PART3;

import java.util.Arrays;

public class pizza_2darray {

	public static void main(String[] args) {
String[][]  pizzas= {{"peperoni","pinnapple"},
		{"anchovies","mushroom","olives"},
		{"cheese"},{"chicken","tomatos","oniones"},
		{"green pappers","zuccini",
			"brocili","spinach","shrimp"}
		};
/*System.out.println(Arrays.toString(pizzas[2])); */


for(String[] pizza:pizzas) {
	System.out.println(pizza.length+"-");
	System.out.println(Arrays.toString(pizza));

}
for (int row=0;row<pizzas.length;row++) {
	for(int column=0;column<pizzas[row].length;column++) {
		System.out.println(pizzas[row][column]);
	}
	for(String value: pizzas[3]){
		System.out.println(value);
	}
	int[][] students={{1,2,3,4},{5,6},{7,20,90,30,45}};
	for(int[] group:students) {
		for(int studentid:group) {
			System.out.println(studentid);
		}
		
	}
}
}
}