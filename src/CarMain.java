import service.*;

public class CarMain {

	public static void main(String[] args) { 
		// 서로 통신하는 접점역할은 interface 가 아니어도 되는데?
		Car c = new SmartCar();
		c.on();
	}
}
