package problem5;

public class Problem5_3 {

	public static void main(String[] args) {
		int deta[] = new int[10];
		for (int i = 0; i < deta.length; i++) {
			deta[i] = (int) (Math.random() * 10) + 1;
			System.out.print(deta[i] + " ");
		}
		System.out.println();
		System.out.print("奇数：");
		for (int i = 0; i < deta.length; i++) {
			if (deta[i] % 2 != 0) {
				System.out.print(deta[i] + " ");
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for (int i = 0; i < deta.length; i++) {
			if (deta[i] % 2 == 0) {
				System.out.print(deta[i] + " ");
			}
		}
		System.out.println();
	}
}
