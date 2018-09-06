package problem3;

public class Problem3_1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10) + 1;
		if (num >= 5) {
			System.out.println("5以上です。");
		} else {
			System.out.println("4以下です。");
		}
	}
}
