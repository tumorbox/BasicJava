package workbook;

public class Test06_Array {
	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student();
		studentArr[0].setName("Kim");
		studentArr[0].setKorean(100);
		studentArr[0].setEnglish(90);
		studentArr[0].setMath(95);
		studentArr[0].setScience(89);
		
		studentArr[1] = new Student();
		studentArr[1].setName("Lee");
		studentArr[1].setKorean(60);
		studentArr[1].setEnglish(70);
		studentArr[1].setMath(99);
		studentArr[1].setScience(98);
		
		studentArr[2] = new Student();
		studentArr[2].setName("Park");
		studentArr[2].setKorean(68);
		studentArr[2].setEnglish(86);
		studentArr[2].setMath(60);
		studentArr[2].setScience(40);
		
		for(int i=0;i<studentArr.length;i++) {
			studentArr[i].print();
		}
		
		
	/*	System.out.println(s1.getName()+" ���:"+s1.getAvg()+
											" ����:"+s1.getGrade());
		System.out.println(s2.getName()+" ���:"+s2.getAvg()+
				" ����:"+s2.getGrade());
		System.out.println(s3.getName()+" ���:"+s3.getAvg()+
				" ����:"+s3.getGrade());*/
		
	}

}











