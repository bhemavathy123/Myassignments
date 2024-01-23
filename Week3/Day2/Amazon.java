package week3.day2;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		System.out.println("cash on delivery");
		
	}

	public void upiPayments() {
		System.out.println("upi payments");
		
	}

	public void cardPayments() {
		System.out.println("card payments");
		
	}

	public void internetBanking() {
		System.out.println("internet banking");
		
	}

	public static void main(String[] args) {
		Amazon a= new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
	}
}
