package chap04;

import java.util.Scanner;

//switch���� - �⺻����(MultiIfTestŬ������ ������ switch�� ����)
//switch���� Ư���� Ȱ��
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���:");
		int ssn = key.nextInt();
		switch (ssn) {
		case 1:
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 4:
			System.out.println("����");
			break;
		default:
			System.out.println("��Ÿ");
		}
	}
}