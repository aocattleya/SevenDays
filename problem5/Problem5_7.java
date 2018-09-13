package problem5;

public class Problem5_7 {

	public static void main(String[] args) {
		int data[] = new int[5];

		int sum = 0;
		int max = 0;
		int min = 100;
		int ave = 0;

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
			sum += data[i];
			max = Math.max(max, data[i]);
			min = Math.min(min, data[i]);
		}
		ave = sum / data.length;
		System.out.println();
		// 合計値
		System.out.println("合計値：" + sum);
		// 平均値
		System.out.println("平均値：" + ave);

		System.out.print("平均値より大きい：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] > ave) {
				// 平均より大きい
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] < ave) {
				// 平均より小さい
				System.out.print(data[i] + " ");
			}
		}
	}
}
