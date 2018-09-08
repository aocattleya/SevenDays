package problem4;

public class Problem4_17 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {		// 行
			for (int j = 0; j < 10; j++) {	// 列
				if (j <= i) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println();
		}
	}
}