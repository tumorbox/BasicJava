package chap04;
//ForExam03.java�� while������ �����ϱ�
public class WhileExam {
	public static void main(String[] args) {
		int i=1;
		int sumVal = 0;//����
		int evenSumVal = 0;//¦����
		int oddSumVal = 0;//Ȧ����
		while(i<=100) {
			sumVal = sumVal + i;
			if(i%2==0) {
				evenSumVal = evenSumVal+i;
			}else {
				oddSumVal = oddSumVal+i;
			}
			i++;
		}
		System.out.println("����:"+sumVal);
		System.out.println("¦����:"+evenSumVal);
		System.out.println("Ȧ����:"+oddSumVal);
	}
}
