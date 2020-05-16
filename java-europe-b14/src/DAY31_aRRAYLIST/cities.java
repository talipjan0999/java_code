package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
cities.add("urumqi");
cities.add("hulja");
cities.add("aksu");
cities.add("burtala");
cities.add("urumqi");
System.out.println(cities.toString());
// print each city by using for loop separated by spaces
for(String city:cities) {
	System.out.println(city+"");
}
/// print each city by using for_iteration loop
System.out.println("=============");
for (int i=0;i<cities.size();i++) {
	System.out.println(cities.get(i));
	
}
System.out.println("Removing burtala");
cities.remove(3);


System.out.println(cities.toString());
cities.add(4, "kashkar");
System.out.println(cities.toString());
int index=cities.indexOf("hulja");
System.out.println(index);

cities.add(4, "hotan");
System.out.println(cities.toString());

cities.clear();
System.out.println(cities.toString());

boolean empty=cities.isEmpty();
System.out.println(empty);
	}
	

}
