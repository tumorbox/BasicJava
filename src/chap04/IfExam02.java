package chap04;

//if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
import java.util.Scanner;

//Ctrl+Shift+f => �ڵ带 ����
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("����:");
		int gender = key.nextInt();
		if (gender < 1 | gender > 4) {
			System.out.println("���ڸ� �߸��Է�");
		} else {
			System.out.print("����:");
			int age = key.nextInt();
			if (gender == 1 | gender == 3) {
				if (age > 20) {
					System.out.println("���γ���");
				} else {
					System.out.println("û�ҳⳲ��");
				}
			} else {
				if (age > 20) {
					System.out.println("���ο���");
				} else {
					System.out.println("û�ҳ⿩��");
				}
			}
		}
	}
}
