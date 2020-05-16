package day19_stringmanupulation_part1;

public class tesk78_counthow_many {

	public static void main(String[] args) {
String str="abbbaaab";
char mychar='c';
int counter=0;
for (int i=0;i<str.length();i++) {
	if(str.charAt(i)==mychar) {
		counter++;
	}
}	System.out.println("count for "+mychar+"is "+counter);

	}

}
