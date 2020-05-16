package review9;

public class subsstring {

	public static void main(String[] args) {
		String s1="The best java cour course in Europe is Cybertek. End of Story";
		String myTarget="Europe";
		int index1=s1.indexOf(myTarget);
		int index2=index1+myTarget.length();
		
		System.out.println(s1.substring(index1, index2));
		
		
		String s2="cybertek";
		for(int i=0;i<s2.length();i++) {
			for(int j=i+1;j<=s2.length();j++) {
				System.out.println(s2.substring(i,j));
			}
		}
	}

}
