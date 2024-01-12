package week1.day2;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=10 , n1=0 , n2= 1;
 
 for(int i=2 ; i < n ; ++i)
{
	System.out.println(n1);
	
	int j = n1+n2;
	n1=n2;
	n2=j;

	}
	}

}
