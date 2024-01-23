package week3.day1;


public class Overloading {
	//method with 2 args
	public void reportStep(String msg,String status)
	{
		System.out.println("message " + msg +  " statu is "+ status);
	}
	
	//same method with 3 args - known as overloading
	public void reportStep(String msg,String status,Boolean snap)
	{
		System.out.println("message " + msg + " statu is "+ status + "snap is" + snap);
	}
	
	public static void main(String[] args) {
		Overloading ch=new Overloading();
		
		ch.reportStep("how r u", "fine");
		
		ch.reportStep("check","status is corect", true);
			
	}
}
