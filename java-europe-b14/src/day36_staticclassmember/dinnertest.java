package day36_staticclassmember;



public class dinnertest {

	public static void main(String[] args) {
diiner mom=new diiner();
diiner kid=new diiner();
diiner dad=new diiner();
System.out.println("total slices;"+diiner.pizzaslice);
dad.takeaslice();
kid.takeaslice();
mom.takeaslice();
System.out.println(diiner.pizzaslice);
kid.takeaslice(3);
dad.takeaslice(2);
	}

}
