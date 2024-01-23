package week3.day1;

public class StringMethods {
	public static void main(String[] args) {
		String ch="Hemavathy";
		char[] cs = ch.toCharArray();
		for(int i=cs.length-1 ; i>=0 ; i--)
		{
			System.out.println("reverse string  " + cs[i]);
					}
	}

}
