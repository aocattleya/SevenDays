package problem3;

public class Problem3_8 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		if (num != 1) {
			System.out.println("1ではありません");
		} else if (num == 1){
			System.out.println("1です。");
		}
	}
}