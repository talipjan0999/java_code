package day48_collection_part3;

import java.util.*;

public class listofMaps {

	public static void main(String[] args) {
		List<Map<String, String>> employees = new ArrayList<>();
		Map<String, String> emp1Data = new HashMap<>();
		emp1Data.put("EmpID", "123");
		emp1Data.put("EmpName", "John");
		emp1Data.put("JobTitle", "SDET");
		emp1Data.put("Salary", "100000");
		Map<String, String> emp2Data = new HashMap<>();
		emp2Data.put("EmpID", "124");
		emp2Data.put("EmpName", "Mike");
		emp2Data.put("JobTitle", "Dev");
		emp2Data.put("Salary", "80000");
		employees.add(emp1Data);
		employees.add(emp2Data);
		System.out.println(employees.toString());
		System.out.println(employees.size());
		System.out.println(employees.get(0));
		System.out.println(employees.get(1).get("EmpName"));
		int totalSalary = 0;
		for (Map<String, String> vl : employees) {
			System.out.println(vl.get("JobTitle"));
		}
		for (Map<String, String> tS : employees) {
			totalSalary = totalSalary + Integer.parseInt(tS.get("Salary"));
		}
		System.out.println("Total Salary: " + totalSalary);
	}
}
