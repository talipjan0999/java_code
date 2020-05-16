package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int  questions;
	int missed;
	System.out.println("how many question are on the final exam");
	questions=sc.nextInt();
	System.out.println("how many questions  student are missed");
missed=sc.nextInt();

FinalExam exam=new FinalExam(questions,missed);
System.out.println("the grade for the exam is "+exam.getGrade());

	}

}
