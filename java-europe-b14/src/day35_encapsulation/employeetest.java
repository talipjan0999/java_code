package day35_encapsulation;

public class employeetest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		System.out.println(e1.getIdNumber());
		e1.setName("murat");
		e1.setIdNumber(78279);
		e1.setPosition("Gdansk");
		e1.setDepartment("math");
		System.out.println(e1.getName()+" "+e1.getIdNumber()+" "+e1.getDepartment()+" "+e1.getPosition());
	}

	
}
