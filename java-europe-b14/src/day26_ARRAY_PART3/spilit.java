package day26_ARRAY_PART3;

import java.util.Arrays;

public class spilit {

	public static void main(String[] args) {
String str1="this info use for creation for password:xxpkkp209.please dont share it with anyone";
String str2="this info use for creation for password:xxpkkp209.please dont share it with anyone";


String[] info1=str1.split("password:");
String[] info2=str2.split("password:");
System.out.println(Arrays.toString(info1));
System.out.println(Arrays.toString(info2));

String  pass1=info1[1].split(".please")[0];
System.out.println(pass1);

String  pass2=info2[1].split(".please")[0];
System.out.println(pass2);


pass1=pass1.substring(2);
pass2=pass2.substring(2, 4);

System.out.println(pass2);

System.out.println(pass2.trim()+pass1.trim());

	}

}
