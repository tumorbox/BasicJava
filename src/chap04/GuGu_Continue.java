package chap04;
//continue - ����� ��ġ �Ʒ��� �ڵ带 skip�ϱ� ���� ���
public class GuGu_Continue {
	public static void main(String[] args) {
		for(int dan=2;dan<=9;dan++) {
			if(dan==5) {
				continue;
			}
			for(int i=1;i<=9;i++) {
				/*if(dan==5) { break���� ���� for�� ����Ǿ� �����Ƿ�
					break;     �ݺ����� ��������� �ʴ´�.
				}*/
				System.out.print(dan+"*"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}
}
