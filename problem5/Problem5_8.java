package problem5;

public class Problem5_8 {

	public static void main(String[] args) {
		int data[] = new int[5];
		int one = 0;
		int two = 0;
		int three = 0;

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 20) - 10;
			System.out.print(data[i] + " ");
			if (0 < data[i]) {
				one++;
			} else if (0 > data[i]) {
				two++;
			} else {
				three++;
			}
		}
		System.out.println();
		System.out.println("0より大きい数：" + one + "個");
		System.out.println("0より小さい数：" + two + "個");
		System.out.println("0の個数：" + three + "個");
	}
}