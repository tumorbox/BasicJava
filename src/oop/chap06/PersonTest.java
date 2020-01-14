package oop.chap06;
//Person클래스를 사용하는 클래스
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("장동건","서울시",45);

		System.out.println("성명:"+p1.getName());
		System.out.println("주소:"+p1.getAddr());
		System.out.println("나이:"+p1.getAge());
		
		Person p2 = new Person("김서연","인천",25);
		
		System.out.println("성명:"+p2.getName());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("나이:"+p2.getAge());
	}
}




