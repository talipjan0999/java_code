package method_part_2;

public class tesk69highschoole {

	public static void main(String[] args) {
int x=calculatehighschooleposition(500);
displayhighschooleposition("mike",x);
displayhighschooleposition("tom",calculatehighschooleposition(1000));
	}

	public static void displayhighschooleposition(String playername, int highschooleposition) {
		System.out.println(playername+"manage to position "+highschooleposition+"on the table");
	}

	public  static int calculatehighschooleposition(int playerscore) {
if(playerscore>=1000) {
		return 0;
	}else if (playerscore>=500 && playerscore<1000) {
		return 1;
	}else if (playerscore>=100 && playerscore<500) {
		return 2;
	}else {return 4;}
	}

}
