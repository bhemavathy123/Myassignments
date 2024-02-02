package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		String companyName="google";
		char ch[]=companyName.toCharArray();
		String emp="";
		
		Set<Character> text=new LinkedHashSet<Character>();
				
		for(Character text1 : ch)
		{
			
		text.add(text1);
								
		}
		emp=emp+text;
				
		System.out.println(emp);
	}

}
