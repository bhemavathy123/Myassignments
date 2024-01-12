package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		
	int num=5;
		
		for(int i=2 ;i<num ;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime: " + num);
				break;
			}
	
			else
			{
				System.out.println("number is prime : " + num);
				break;
			}
		
		}
	}

}
