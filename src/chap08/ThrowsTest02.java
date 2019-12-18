package chap08;

import java.util.Scanner;

//메소드를 호출하는 곳에서 예외를 처리하도록 설정
public class ThrowsTest02 {
	// test메소드는 ArithmeticException이 발생할 수 있는 메소드다
	public int test(int num1, int num2) throws ArithmeticException {// 계산만 하는 메소드
		int result = 0;
		System.out.println("-------test()메소드 내부-------");
		System.out.println("입력값:" + num1);
		System.out.println("입력값:" + num2);
		result = num1 / num2;
		System.out.println("결과:" + result);
		System.out.println("-------test()메소드 내부-------");
		return result;
	}

	// 예외를 호출하는 곳에서 직접 처리하기
	public void show() {// 숫자를 전달하며 test()를 호출하는 메소드
		Scanner key = new Scanner(System.in);
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		try {
			System.out.print("숫자입력:");
			num1 = key.nextInt();
			System.out.print("숫자입력:");
			num2 = key.nextInt();
			result = test(num1, num2);
		} catch (ArithmeticException e) {
			// num1이 10의 배수이면 result에 1000을 할당
			// num1이 7의 배수이면 result에 10000을 할당
			// 그외 result에 100을 할당
			if (num1 % 10 == 0) {
				result = 1000;
			} else if (num1 % 7 == 0) {
				result = 10000;
			} else {
				result = 100;
			}
		} finally {
			// 무조건 실행되어야 하는 명령문
			System.out.println("test()호출결과:" + result);
		}
	}

	public static void main(String[] args) {
		ThrowsTest02 obj = new ThrowsTest02();
		obj.show();
	}

}
