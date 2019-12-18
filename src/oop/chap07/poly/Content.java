package oop.chap07.poly;

public abstract class Content {
	String title;
	int price;

	public Content() {

	}

	public Content(String title) {
		super();
		this.title = title;
	}

	public abstract void totalPrice();

	public void show() {
		System.out.println(title + " ������ ������ " + price + " �� �Դϴ�.");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
