package day20_stringmanipulation_part2;

public class timestep {

	public static void main(String[] args) {
		String time="07/02/2020 21:09";
		System.out.println(Timestep(time));
	}
	public static String Timestep(String time) {
		time=time.replace("/", "").replace(":", "").replace(" ", "");
		return time;
	}
}
