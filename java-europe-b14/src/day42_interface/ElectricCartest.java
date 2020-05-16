package day42_interface;

public class ElectricCartest {

	public static void main(String[] args) {
		Tesla models=new Tesla("model s",4500,"grey");
		models.charge();
		models.drive();
		models.stop();
		System.out.println("==============");
		
		Ford fusion=new Ford("fusion",3500,"black",2019);
		fusion.charge();
		fusion.drive();
		fusion.start();
		fusion.stop();
		System.out.println("==============");
		TeslaTruck tr=new TeslaTruck("cybertektruck",10000,"white",6.0);
		tr.charge();
		tr.start();
		tr.drive();
		
		System.out.println("==============");
		System.out.println(models.toString());
		System.out.println(fusion.toString());

		System.out.println(tr.toString());


	}

}
