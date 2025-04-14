import ch82.*;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		ITire frontRightTire = new HankookTire();
		c.list.add(frontRightTire);
		ITire frontLeftTire = new HankookTire();
		c.list.add(frontLeftTire);
		ITire backRightTire = new NexenTire();
		c.list.add(backRightTire);
		ITire backLeftTire = new KumhoTire();
		c.list.add(backLeftTire);
		
		c.move();		
	}
}
