package exday2;

public class SampleEx201 {

	public static void main(String[] args) {

		Car c = new Car();
		c.supply(10);
		c.move();
		c.move();
		Ambulance a = new Ambulance();
		a.supply(10);
		a.move();
		a.sevePeople();
	}
}