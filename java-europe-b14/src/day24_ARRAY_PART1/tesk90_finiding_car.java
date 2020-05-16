package day24_ARRAY_PART1;

public class tesk90_finiding_car {

	public static void main(String[] args) {
		boolean flag=false;
String[] cars= {"Honda","Nissan","toyota","mersedes"};
for(int i=0;i<cars.length;i++) {
	if(cars[i].equals("Honda")) {
		flag=true;
		break;
	}
}
if (flag) {
	System.out.println("find it");
}else {
	System.out.println(" not find it");
}
	}

}
