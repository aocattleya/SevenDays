package problem3;

public class Problem3_13 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 3) + 1;
		if (num == 1) {
			System.out.println("グー");
		} else if (num == 2) {
			System.out.println("パー");
		} else if (num == 3) {
			System.out.println("チョキ");
		}
	}
}