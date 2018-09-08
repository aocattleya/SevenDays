package problem4;

public class Problem4_11 {

	public static void main(String[] args) {
		int num = 0;
		int max = 0;
		for (int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 100) + 1;
			System.out.println(num);
			max = Math.max(max, num);
		}
		System.out.println("最大値：" + max);
	}
}