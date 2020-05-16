package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class shoppinglist {

	public static void main(String[] args) {
		ArrayList<String> shoppinglist=new ArrayList<>();
shoppinglist.add("fruit");
shoppinglist.add("clothes");
shoppinglist.add("trash bag");
shoppinglist.add("dish soap");
shoppinglist.add("shovel");
shoppinglist.add("paper towel");
// print number of items
int count=shoppinglist.size();
System.out.println(count);

// print all items in single line
System.out.println(shoppinglist.toString());

//print first and last item in single line
System.out.println(shoppinglist.get(0)+"|"+shoppinglist.get(count-1));

shoppinglist.clear();
System.out.println(shoppinglist.toString());


	}

}
