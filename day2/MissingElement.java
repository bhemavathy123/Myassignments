package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(a);
				
		for (int i =1; i < a.length; i++) 
		{
			if(a[i]-a[i-1] == 1)
			{
				
							}
			else
			{
				System.out.println(a[i-1]+1);
			}
			

		}
	}

}
