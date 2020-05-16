package day3_variables_datatype;

import java.util.ArrayList;

public class GroceryList {
ArrayList<String> groceryList=new ArrayList<>();
public void addGroceryListitem(String item) {
	groceryList.add(item);
}
public void  printGrocerylist() {
	System.out.println("you have "+groceryList.size()+"items in your grocery list");
	for(int i=0;i<groceryList.size();i++) {
		System.out.println(i+1+"."+groceryList.get(i));
	}
}
	public void modifyGroceryListitem(int i ,String newitem) {
		groceryList.set(i, newitem);
		System.out.println("grocery item"+(i+1)+"has been modified");
}
	public void removeGroceryListitem(int position) {
		groceryList.remove(position);
	}
	public String  finditem(String  searchitem) {
		int position=groceryList.indexOf(searchitem);
		if(position>=0) {
			return  groceryList.get(position);
		}
		return null;
	}
}
