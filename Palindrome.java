package week1.day2;

public class Palindrome {
	public static void main(String[] args) {

int input=1234 , output=0 , remainder ;
int original=input;
while (original!=0)
{
	remainder=original % 10;
	original= original/10;
	output=output*10 + remainder;
	
	}
if (input==output)
{
	System.out.println(input + "is palindrome");
}
else
{
	System.out.println(input + "is not palindrome");
}
		
	}
}
	



