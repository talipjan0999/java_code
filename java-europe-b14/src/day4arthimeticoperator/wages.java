package day4arthimeticoperator;
//This program calculates hourly Wages plus overtime

public class wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double regularWage; //The calculated regular wage
		float basePay=25.75f; //The base pay
		double regularHours=40; //The hours worked less overtime
		double overtimeWages; //Overtime Wages
		double overTimePay=37.5; //Overtime Pay rate
		double overTimeHours=15;
		double totalWage; //Total Wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);

	}

}
