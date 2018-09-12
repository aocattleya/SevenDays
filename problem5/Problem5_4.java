package problem5;

public class Problem5_4 {

	public static void main(String[] args) {
		int deta[] = new int[10];
		for (int i = 0; i < deta.length; i++) {
			deta[i] = (int)(Math.random() * 100) + 1;
			System.out.print(deta[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数：");
		for (int i = 0; i < deta.length; i++) {
			if (deta[i] >= 50) {
				System.out.print(deta[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数：");
		for (int i = 0; i < deta.length; i++) {
			if (deta[i] <= 50) {
				System.out.print(deta[i] + " ");
			}
		}
		System.out.println();
	}
}