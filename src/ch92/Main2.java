package ch92;

public class Main2 {
	public static void main(String[] args) {
		Main2 m = new Main2();
		m.exe((name) -> System.out.println(name + "이 일하다")); // 기능만 넘길때 사용하는 문법 - 람다(lamda)
		
		m.exe(new IParent() {
			@Override
			public void work(String name) {
				System.out.println(name + "이 일하다");
			}
		});
	}
	
	public void exe(IParent p) {
		p.work("구디");
	}
}

@FunctionalInterface
interface IParent {
	void work(String name);
}