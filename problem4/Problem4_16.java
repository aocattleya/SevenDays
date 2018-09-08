package problem4;

public class Problem4_16 {

	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.print(b + " * " + a + " = " + (a * b) + " ");
				if (b == 9) {
					System.out.println( );
				}
			}
		}
	}
}
