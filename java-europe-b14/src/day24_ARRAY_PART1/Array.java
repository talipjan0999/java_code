package day24_ARRAY_PART1;

public class Array {

	public static void main(String[] args) {
int[]  mylist= {10,20,30,40};
String[] myarray= {"apple","beach","mango"};
System.out.println(mylist[2]);
System.out.println(mylist[3]);
System.out.println(myarray[2]);

System.out.println(mylist.length);
System.out.println(myarray.length);

for (int i=0;i<mylist.length;i++) {
	System.out.println(mylist[i]);
}
	}

}
