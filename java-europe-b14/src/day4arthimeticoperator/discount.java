package day4arthimeticoperator;

public class discount {

	public static void main(String[] args) {
		//This program calculates the sale price of an
				//item that is regulary priced at $59, with a 20% Discount on it 
				
				int regularPrice=59;
				double discount;
				double salesPrice;
				discount=regularPrice*0.2;
				salesPrice=regularPrice-discount;
				
				System.out.println("Regular Price: $" + regularPrice);
				System.out.println("Discount Amount: $" + discount);
				System.out.println("Sale Price: $" + salesPrice);
	}

}
