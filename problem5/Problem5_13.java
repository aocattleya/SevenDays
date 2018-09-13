package problem5;

public class Problem5_13 {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int i, j;
		int max = 0;
		int min = 100;

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 9);
			}
		}
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				max = Math.max(max, a[i][j]);
				min = Math.min(min, a[i][j]);
			}
			System.out.println();
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}