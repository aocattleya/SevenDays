package problem5;

public class Problem5_12 {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int i, j;

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 9);
			}
		}
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}