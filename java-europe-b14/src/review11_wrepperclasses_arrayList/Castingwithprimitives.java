package review11_wrepperclasses_arrayList;

public class Castingwithprimitives {

	public static void main(String[] args) {
boolean b1 = Boolean.parseBoolean("true");
		
		byte byteValue = Byte.parseByte("100");
		
		short shortValue = Short.parseShort("10000");
		
		int intValue = Integer.parseInt("500");
		
		double doubleValue = Double.parseDouble("243.4");
		
		if(doubleValue > 155) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}