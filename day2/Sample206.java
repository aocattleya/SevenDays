package day2;

public class Sample206 {

	public static void main(String[] args) {
		final int NUMBER = 100;
		final String STRING = "Hoge";
		System.out.println(NUMBER);
		System.out.println(STRING);
		// finalが付いた変数は値を変えられない
		//NUMBER = 100;
		//STRING = "fuga";

		// finalを用いて定数を定義する場合、変数名は大文字にするという習慣がある
	}
}
