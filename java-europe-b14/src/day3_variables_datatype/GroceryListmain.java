package day3_variables_datatype;

import java.util.Scanner;

public class GroceryListmain {
	 static GroceryList grocerylist=new GroceryList();
static 	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		boolean quit =false;
		int choise=0;
printinstructions();
while(!quit) {
	System.out.println("enter your choise ");
	choise=scanner.nextInt();
	scanner.nextLine();
	switch (choise) {
	case 0:
		printinstructions();
		break;
	case 1:
		grocerylist.printGrocerylist();
		///System.out.println("print list Grocery items");
		break;
		case 2:
			addItem();
			///System.out.println("add a item to the list .");
			break;
		case 3:
			modifyitem();
			//System.out.println("modify the items in the list.");
			break;
		case 4:
			removeItem();
			///System.out.println("remove the items in the list.");
			break;
		case 5:
			searchItem();
			//System.out.println("search the items in the list.");
			break;	
		case 6:
			quit=true;
			break;
	}
}
	}
private static void searchItem() {
	System.out.println(" item to research for :");
String searchitem=scanner.nextLine();
if(grocerylist.finditem(searchitem)!=null) {
	System.out.println("found "+searchitem+"in your grocery list");
}else {
	System.out.println(searchitem +"is not in your grocer list");
}
	}
private static void removeItem() {
	System.out.println("enter you  item number.");
	int itemno=scanner.nextInt();
	scanner.nextLine();
	
	grocerylist.removeGroceryListitem(itemno-1);
	}
public static void addItem() {
		System.out.println("enter you grocery item.");
		grocerylist.addGroceryListitem(scanner.nextLine());
	}
public static void modifyitem() {
	System.out.println("enter you  item number.");
int itemno=scanner.nextInt();
scanner.nextLine();
System.out.println("enter you  replacement item.");
String newitem=scanner.nextLine();
grocerylist.modifyGroceryListitem(itemno-1,newitem);
}
public static void printinstructions() {
	System.out.println("\npress");
	System.out.println("\t 0-to print choise options.");
	System.out.println("\t 1-to print list Grocery items");
	System.out.println("\t 2-to add a item to the list .");
	System.out.println("\t 3-to to modify the items in the list.");
	System.out.println("\t 4-to to remove the items in the list.");
	System.out.println("\t 5-to to search the items in the list.");
	System.out.println("\t 6-to to quite the application.");

}
}
