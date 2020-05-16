package day32_arraylist_part2;

import java.util.ArrayList;
import java.util.Random;

public class custommethod {

	public static void main(String[] args) {
ArrayList<Integer> numlist=new ArrayList();
numlist.add(10);
numlist.add(11);
numlist.add(101);
numlist.add(102);
printList(numlist);
ArrayList<Double > doublelist=new ArrayList();
doublelist.add(12.2);
doublelist.add(12.29);
doublelist.add(12.92);

double sum=sumlist(doublelist);
System.out.println(Math.round(sum));
ArrayList<Integer > list=getList(25);
System.out.println(list.toString());
ArrayList<Integer> rlist=getrandomList(20);
System.out.println(rlist.toString());

	}
private static ArrayList<Integer> getrandomList(int k) {
	Random r=new Random();
	ArrayList<Integer> Randomnumbers=new ArrayList<>(); 
	for(int i=0;i<k;i++) {
		Randomnumbers.add(r.nextInt(101));
	}
		return Randomnumbers;
	}
private static ArrayList<Integer> getList(int ik) {
	ArrayList<Integer> newlist=new ArrayList<>();
	for(int i=1;i<=ik;i++) {
		newlist.add(i);
	}
		return newlist;
	}
private static double sumlist(ArrayList<Double> dlist) {
	double sum=0;
	for(Double d:dlist) {
		sum=sum+d;
		
	}
		return sum;
	}
public static void printList(ArrayList<Integer> nums) {
	for(Integer n:nums) {
		System.out.println(n+"");
	}
}
}
