package chap03;

import java.util.Random;

public class APIExam {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNum = rand.nextInt();
		//System.out.println("������=>"+randomNum);
		
		randomNum = rand.nextInt(100)+1;
		System.out.println("������=>"+randomNum);
	}

}
