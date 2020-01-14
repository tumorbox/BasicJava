package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount;
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")){
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}else {
			setPrice(10);
		}
	}
	//static����� �׼����ϱ� ���ؼ� static�޼ҵ带 �����ؼ� �׼����Ѵ�.
	public static int getAmount() {
		return amount;
	}
}









