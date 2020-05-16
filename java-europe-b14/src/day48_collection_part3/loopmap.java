package day48_collection_part3;

import java.util.*;

public class loopmap {

	public static void main(String[] args) {
Map<String,String> dataMap=new HashMap<>();
dataMap.put("url", "qa3.vytrack.com");
dataMap.put("username", "user66");
dataMap.put("browser", "chrome");
dataMap.put("trucdriver", "bob");
dataMap.put("storemanger", "john");

//key -> return set with all the keys in the map
//valuse-> returns with all the valuse in the map


System.out.println("++++KEYS++++");
for (String key:dataMap.keySet()) {
	System.out.println(key);
}


System.out.println("++++VALUES++++");
for(String value:dataMap.values()) {
	System.out.println(value);

}

System.out.println("++++KEYS++++   |  ++++vaules++++");




for(String key:dataMap.keySet()) {
	System.out.println(key+"|"+dataMap.get(key));

}
// looping by using forEach method
dataMap.forEach((K,V) -> System.out.println(K+"|"+V));

Map<Integer,Product> studentMap=new HashMap<>();

Map<String ,String[]> data=new HashMap<>();
Map<Integer,List<String>> data2=new HashMap<>();

Map<Integer ,List<String[]>> data3=new HashMap<>();
Map<Integer,Map<Integer,Integer>> data4=new HashMap<>();
Map<String,Map<Integer,Product>> data5=new HashMap<>();
 

	}

}
