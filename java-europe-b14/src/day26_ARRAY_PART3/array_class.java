package day26_ARRAY_PART3;

import java.util.Arrays;

public class array_class {

	public static void main(String[] args) {
int[] num= {1,20,9,2,78,9098};
System.out.println(Arrays.toString(num));
Arrays.sort(num);
System.out.println(Arrays.toString(num));

String[] languages= {"uyghur","kazzak","uzbek",
		"kirgz","turuk","tatar","azarbayjan","turukman"};
Arrays.sort(languages);

System.out.println(Arrays.toString(languages));
System.out.println(Arrays.binarySearch(num, 9098));
System.out.println(Arrays.binarySearch(num, 9));
System.out.println(Arrays.binarySearch(num, 20));
System.out.println(Arrays.binarySearch(num, 909));
System.out.println(Arrays.binarySearch(num, 201));
System.out.println(Arrays.binarySearch(num, 19)); /* java calculation inside is : (-(insertationpoint)-)*/

/* copyof */
double[] d1= {1,2,3,9,8};
double[] d2=d1;
d1[0]=100.9;
d1[2]=120.9;
System.out.println(Arrays.toString(d1));
System.out.println(Arrays.toString(d2));
d1[2]=1933;
double[] d3=Arrays.copyOf(d1, d1.length+1);
System.out.println(Arrays.toString(d3));

 	}

}
