package problem3;

public class Problem3_12 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 20) - 10;
		if (num < 0) {
			System.out.println("負の値です");
		} else if (num < 10 && num != 0) {
			System.out.println("正の値です");
		} else {
			System.out.println("0です");
		}
	}
}