package problem4;

public class Problem4_12 {

	public static void main(String[] args) {
		int min = 100;
		for (int i = 0; i < 5; i++) {
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			min = Math.min(min, num);
		}
		System.out.println("最小値：" + min);
	}
}