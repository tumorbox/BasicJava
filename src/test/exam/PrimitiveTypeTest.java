package test.exam;

//�ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest {
	public static void main(String[] args) {
		// boolean��
		boolean bool = true;// true or false
		System.out.println(bool);

		// ������
		char c = 'a';// charŸ�� ������ ���ͷ��� ǥ���Ҷ� ''�� ǥ��
		System.out.println(c);

		// ����������
		// ������������ �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127;
		System.out.println(b);

		short s = 32767; // short = int
		System.out.println(s);

		int i = 2147483647; // int = int
		System.out.println(i);

		long l = 2147483648L;// longŸ���� ��� ���̻� L�̳� l��
								// �߰��Ѵ�.
		System.out.println(l);

		// �Ǽ���
		// �Ǽ��� ���ͷ��� �⺻ Ÿ���� double
		float f = 10.5F; // float = double
							// floatŸ���� ��� ���̻� F�� f�� �߰��Ѵ�.
		System.out.println(f);
		double d = 10.5;
		System.out.println(d);

		double exam = 10 / 3.0;
		System.out.println(exam);

	}
}