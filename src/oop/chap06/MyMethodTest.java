package oop.chap06;

//MyMethodŬ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("*******���α׷� ����*********");
		MyMethod m = new MyMethod();
		// 1. �Ű������� ���� void�� �޼ҵ��� ȣ��
		m.display();
		System.out.println("++++++++step1+++++++++");
		m.display();
		System.out.println("++++++++step2+++++++++");
		m.display();

		// 2. �Ű������� �� ��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");

		// m.display(20,"��");//display(int,String)
		m.display("��", 20);
		m.display("��", 5);
		m.display("��", 100);// display(String,int)
		System.out.println("========���α׷� ����==========");

		// �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		// �޼ҵ带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ���
		// �� ���ϰ��� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		// �� �ٸ� �޼ҵ��� �Ű������� ������ �� �ִ�.
		int result = m.add(100, 200);
		System.out.println("�޼ҵ� ȣ�� ���=>" + result);

		System.out.println("�޼ҵ� ȣ�� ���=>" + m.add(200, 300));
	}
}
