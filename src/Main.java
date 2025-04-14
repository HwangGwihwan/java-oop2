import service.*;

public class Main {

	public static void main(String[] args) {

		ITv tv;
		tv = new OTT(); // 추상클래스는 객체 X, interface 객체 X
		// 부모타입(클래스, 추상클래스, 인터페이스)에 자식객체를 대입 -> 다형성
		tv.onOff(); // ITv를 통해서 SmartTv의 onOff를 호출
	
	}
}
