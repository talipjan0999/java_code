package day48_collection_part3;

import java.util.Set;


public class HashSetsofProducts {
	public static void main(String[] args) {
Set<Product> prodset=new Hashset<>();
prodset.add(new product("book",25.99));
prodset.add(new product("book",21.99));
prodset.add(new product("magizine",25.90));
System.out.println(prodset.toString());
//print each product by using fro each loop
for(prodct p:prodset) {
	System.out.println(p.getPrice());
	
	//print each product by using each method 
	
	prodset.forEach(x-> System.out.println(x.getName()));

}
System.out.println("prodset.hasNext():"+prodset.hasNext());

System.out.println("prodset.next():"+prodset.next());
System.out.println("prodset.next():"+prodset.next());
System.out.println("prodset.next():"+prodset.next());




}
}