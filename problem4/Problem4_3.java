package problem4;

public class Problem4_3 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("数：" + num);
		int i = 0;
		do {
			System.out.print("■");
			i++;
		} while (i < num);
	}
}