package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
public static void main(String[] args) {
	
		List<Integer> n1=new ArrayList<Integer>();
		n1.add(1);
		n1.add(2);
		n1.add(3);
		n1.add(4);
		n1.add(10);
		n1.add(6);
		n1.add(8);
		Collections.sort(n1);
		for(int i=1 ;i<10 ; i++)
		{
			if(!n1.contains(i))
			{
				System.out.println(i);
			}
			else
			{
				
			}
			}
			
		
}
}
