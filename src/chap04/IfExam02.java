package chap04;

//if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력하는 예제
import java.util.Scanner;

//Ctrl+Shift+f => 코드를 정리
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("성별:");
		int gender = key.nextInt();
		if (gender < 1 | gender > 4) {
			System.out.println("숫자를 잘못입력");
		} else {
			System.out.print("나이:");
			int age = key.nextInt();
			if (gender == 1 | gender == 3) {
				if (age > 20) {
					System.out.println("성인남자");
				} else {
					System.out.println("청소년남자");
				}
			} else {
				if (age > 20) {
					System.out.println("성인여자");
				} else {
					System.out.println("청소년여자");
				}
			}
		}
	}
}
