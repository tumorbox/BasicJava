package oop.chap07;

public class CheckingAccount extends Account{
	private String cardNo;
	public CheckingAccount(String account,
			String ownerName,int balance,String cardNo) {
		super(account,balance,ownerName);
		this.cardNo = cardNo;
	}
	//���ڿ��񱳴� ������ equals�� �̿��ؼ� ���Ѵ�.
	//== X
	public void pay(int amount,String cardNo) {
		if(this.cardNo.equals(cardNo) 
						& getBalance()>=amount) {
			//���Ұ����� ����
			withdraw(amount);
		}else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
}





