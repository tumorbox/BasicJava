package chap05;

//�迭 �׼����ϱ�
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] myarr = new int[7];
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		// �迭�� ����� ũ�⸦ ���
		// length - �迭�� ����� �����ϰ� �ִ� �⺻ ����(�ڵ����� �����Ǵ�)
		System.out.println("�迭�� ����� ����:" + myarr.length);
		System.out.println("======================");
		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
	}
}