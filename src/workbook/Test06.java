package workbook;

public class Test06 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Kim");
		s1.setKorean(100);
		s1.setEnglish(90);
		s1.setMath(95);
		s1.setScience(89);

		Student s2 = new Student();
		s2.setName("Lee");
		s2.setKorean(60);
		s2.setEnglish(70);
		s2.setMath(99);
		s2.setScience(98);

		Student s3 = new Student();
		s3.setName("Park");
		s3.setKorean(68);
		s3.setEnglish(86);
		s3.setMath(60);
		s3.setScience(40);

		s1.print();
		s2.print();
		s3.print();
		/*
		 * System.out.println(s1.getName()+" ���:"+s1.getAvg()+ " ����:"+s1.getGrade());
		 * System.out.println(s2.getName()+" ���:"+s2.getAvg()+ " ����:"+s2.getGrade());
		 * System.out.println(s3.getName()+" ���:"+s3.getAvg()+ " ����:"+s3.getGrade());
		 */

	}

}
