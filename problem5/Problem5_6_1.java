package problem5;

public class Problem5_6_1 {

	public static void main(String[] args) {
		int deta[] = new int[10];
		int max = deta[0];
		int sum, average;
		for (int i = 0; i < deta.length; i++) {
			deta[i] = (int) (Math.random() * 10) + 1;
			System.out.print(deta[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < deta.length; i++) {
			if (max < deta[i]) {
				max = deta[i];
			}
		}
		System.out.println("最大値：" + max);
		int min = deta[0];
		for (int i = 0; i < deta.length; i++) {
			if (min > deta[i]) {
				min = deta[i];
			}
		}
		System.out.println("最小値：" + min);
		sum = 0;
		for (int i = 0; i < deta.length; i++) {
			sum += deta[i];
		}
		average = sum / deta.length;
		System.out.println("平均値：" + average);
	}
}