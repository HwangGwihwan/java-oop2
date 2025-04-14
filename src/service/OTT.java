package service;

public class OTT implements ITv{
	@Override
	public void onOff() {
		System.out.println("OTT서비스에 로그인 확인");
		System.out.println("서비스 시작 TV ON!");
	}

}
