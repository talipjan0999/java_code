package review6review7;

public class amazonshop {

	public static void main(String[] args) {
product product1=new product();
product product2=new product();
product1.price=5;
product1.title="spoon";
product1.rating=4;
product1.seller="spoonseller";
System.out.println(product1.title);
System.out.println(product2.title);
product2.title="Gloves";
product2.price=10;
product2.rating=5;
product1.display();
product2.display();

	}

}
