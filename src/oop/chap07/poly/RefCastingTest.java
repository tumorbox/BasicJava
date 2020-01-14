package oop.chap07.poly;
//��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class Parent{
	String name="�嵿��";
	public void display() {
		System.out.println("�θ��� display");
	}
}
class Child extends Parent{
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ�Ŭ������ display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}
public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("************************************");
		System.out.println("2. subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		
		/*
		 * ��ü�� ����ȯ
		 * - ������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		System.out.println("************************************");
		System.out.println("3. superŸ���� ���������� sub��ü�� ����");
		Parent obj3 = new Child(); //�ڵ�����ȯ
		obj3.display();//�޼ҵ� : �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ��
		System.out.println(obj3.name);//���� : �������� Ÿ�Կ� �ش��ϴ� 
		                              //     Ŭ������ ��������� ����
		//Ÿ���� ParentŸ�������� ������ ������ ��ü�� ChildŸ���̱� ������
		//ChildŸ������ ����ȯ�� �����Ѵ�.(�����)
		((Child)obj3).test();
		System.out.println("************************************");
		System.out.println("4. subŸ���� ���������� super��ü�� ����----X");
		//Child obj4 = new Parent();
		
		System.out.println("************************************");
		System.out.println("5. subŸ���� �������� = "+
					"superŸ���� ��������(Super��ü�� ����)-----X");
		//��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ���������
		//ĳ������ �Ϸ��� �Ҷ� obj1�� Child������ ���� ���� �����Ƿ� ĳ���� ���ܹ߻�
		//Child obj5 = (Child)obj1;
		
		System.out.println("************************************");
		System.out.println("6. subŸ���� �������� = "+
					"superŸ���� ��������(Sub��ü�� ����)-----O");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		
		Parent obj7 = obj2;
		
		Parent obj8=null;//������ car����
		Child obj9 = new Child(); //fe
		Child obj10 = null; //fe2
		
		obj8 = obj9;//superŸ�� = subŸ��
		obj10 = (Child)obj8;
		obj10.test();
		System.out.println(obj8.name);
		System.out.println(obj9.name);
		System.out.println(obj10.name);
		
	}
}















