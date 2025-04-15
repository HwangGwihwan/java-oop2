package ch92;

public class Main {
	public void exe(Parent p) {
		p.work();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Parent p = new Parent();
		m.exe(p);
		
		Child c = new Child();
		m.exe(c);
		
		m.exe(new Child());
		
		Parent p2 = new Parent() { // 일회성 객체, 익명 객체 --> 클래스를 따로 만들필요가 없다
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
		};
		m.exe(p2);
		
		m.exe(new Parent() { // 익명객체의 변수를 만들필요가 없다
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
		});
		
	}
}

class Parent {
	void work() {
		System.out.println("일(직업)한다");
	}
}

class Child extends Parent {
	@Override
	void work() {
		System.out.println("공부한다");
	}
}