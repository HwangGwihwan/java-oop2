package service;

public class SmartTv implements ITv{
	// 인터페이스를 구현하여 추상 클래스를 생성
	// 일반 클래스를 생성하고자 한다면 추상메서드를 오버라이딩
	
	@Override
	public void onOff() {
		System.out.println("인터넷이 된다면 TV ON!");
	}
}
