package problem3;

public class Problem3_5 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) + 1;
		if (num >= 20 && num < 80) {
			System.out.println("20以上80未満です");
		}
	}
}