package ch82;

import java.util.ArrayList;

public class Car {
	// 필드의 다형성을 사용
	public ArrayList<ITire> list = new ArrayList<ITire>();
	
	public void move() {
		for(ITire t : this.list) {
			t.roll();
		}
	}	
}
