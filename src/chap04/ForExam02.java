package chap04;

import java.util.Scanner;

//�Է¹��� �������� ���
public class ForExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("��� ��:");
		int dan = key.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}
}
