package problem5;

public class Problem5_6_1 {

	public static void main(String[] args) {
		int data[] = new int[10];
		int max = data[0];
		int sum, average;
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		System.out.println("最大値：" + max);
		int min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("最小値：" + min);
		sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		average = sum / data.length;
		System.out.println("平均値：" + average);
	}
}