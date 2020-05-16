package day33_class_object_constructer;

public class car_test {

	public static void main(String[] args) {
		car c1=new car();
		
		car c2=new car("honda","civic",2020,500,"white");
		car c3=new car("bmw","320",2017,3000,"red");
		
		System.out.println(c1.color);
		System.out.println(c2.color);

	}

}
