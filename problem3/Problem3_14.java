package problem3;

public class Problem3_14 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		System.out.println(a);
		System.out.println(b);
		if (a < b) {
			System.out.println("aのほうが大きいです。");
		} else if (a > b) {
			System.out.println("bのほうが大きいです");
		} else {
			System.out.println("等しいです");
		}
	}
}