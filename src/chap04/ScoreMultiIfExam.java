package chap04;

import java.util.Scanner;

//multiif���� - ������
public class ScoreMultiIfExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int jumsu = key.nextInt();
		if (jumsu > 100 | jumsu < 0) {
			System.out.println("�߸��Է�");
		} else {
			if (jumsu >= 90) {
				System.out.println("A");
			} else if (jumsu >= 80) {
				System.out.println("B");
			} else if (jumsu >= 70) {
				System.out.println("C");
			} else if (jumsu >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}

}
