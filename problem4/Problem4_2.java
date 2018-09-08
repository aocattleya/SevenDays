package problem4;

public class Problem4_2 {

	public static void main(String[] args) {
		int i = 0;
		int num = (int)(Math.random() * 10) + 1;
		System.out.println("数：" + num);
		while(i <= num) {
			System.out.print("■");
			i ++;
		}
	}
}