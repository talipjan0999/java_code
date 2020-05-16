package day19_stringmanupulation_part1;

public class tesk77_emogy_programm {

	public static void main(String[] args) {
String emogy=":)";
if(emogy.length()!=2) {
	System.out.println("invalied emogy");
return;
}

char first=emogy.charAt(0);
char second=emogy.charAt(1);

if (first==':') {
	if(second==')') {
		System.out.println("simile");
	 }else if (second=='(') {
		System.out.println("sad");
     }else if (second=='/') {
	    System.out.println("upset");
     }else {
	     System.out.println("unknown emogy");
	     }
	
  } else if (first==';') {
		if(second==')') {
	     System.out.println("wink");
}else  if(second=='0') {
	     System.out.println("suprised");
}else {
	System.out.println("unknown emogy");
	}
  }else {
		System.out.println("invalied emogy");

  }
	}
}


