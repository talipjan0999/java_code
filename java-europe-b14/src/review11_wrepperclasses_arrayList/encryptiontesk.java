package review11_wrepperclasses_arrayList;

public class encryptiontesk {

	public static void main(String[] args) {
		 System.out.println(encrypted("cybertek"));
	}
	public static String encrypted(String word) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	 String encrypted ="zyxwvutsrqponmlkjihgfedcba ";
	 String dummy="";
	 for(int i=0;i<word.length();i++) {
		 // 1.read a lter from word 
		 char myletter=word.charAt(i); // j
		 // 2. find the position /index of myletter in a aplpabet an save it into i idx
		 int iidx=alphabet.indexOf(myletter); // 9
		 // 3. read the letter  from   encrypted and store into char
		 char dec=encrypted.charAt(iidx); //q
		 dummy=dummy+dec;// q
	 }
		return dummy;
	}
		       }