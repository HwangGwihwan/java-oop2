package ch101;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("hello"); // 모든 코드는 예외를 발생시킬수 있다
			System.out.println(5/0);
			System.out.println("bye");
		} catch(Exception e) {
			System.out.println("예외발생");
			return;
		} finally {
			System.out.println("finally");
		}
	}
}