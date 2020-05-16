package day16;

public class dogobjects {

	public static void main(String[] args) {
 dog dog1=new dog();
 dog dog2=new dog();
 dog dog3=new dog();
 dog dog4=new dog();
 dog1.breed="maltese";
 dog1.age=33;
 dog1.color="red";
 dog1.name="Atti";
 System.out.println(dog1.breed);
 System.out.println(dog1.color);
 System.out.println(dog1.name);
 System.out.println(dog1.age);
 dog1.barking();
 dog1.hungry();
 dog1.sleeping();
	}

}
