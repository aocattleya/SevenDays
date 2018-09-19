package exday2;

public class Ambulance extends Car {
	// 番号
	private int number = 119;

	// コンストラクタ
	public Ambulance() {
		System.out.println("Ambulanceアブジェクト生成");
	}

	// 救急救命活動
	public void sevePeople() {
		System.out.println("救急救命活動");
		System.out.println("呼び出しは" + number + "番");
	}
}