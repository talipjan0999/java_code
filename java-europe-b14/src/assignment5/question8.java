package assignment5;

public class question8 {

	public static void main(String[] args) {
int player=19;
int house=19;
int card=19;
if (card>player) {
	System.out.println(" bust");
}
else if (house>player){
	System.out.println(" player loss");
}else if (house==player){
	System.out.println(" its a tie");
	}
else if (house<player){
	System.out.println(" player wins");
}
}
}