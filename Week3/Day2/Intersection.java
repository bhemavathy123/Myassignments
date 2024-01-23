package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
						
		List<Integer> n1=new ArrayList<Integer>();
		n1.add(3);
		n1.add(2);
		n1.add(11);
		n1.add(4);
		n1.add(6);
		n1.add(7);
		
		List<Integer> n2=new ArrayList<Integer>();
		n2.add(1);
		n2.add(2);
		n2.add(8);
		n2.add(4);
		n2.add(9);
		n2.add(7);
		
				
		for(int i=0 ; i < n1.size(); i++)
		{
			for(int j=0 ; j < n2.size();j++)
			{
				if(n1.get(i).equals(n2.get(j)))
				{
					System.out.println("common number :" + n1.get(i));
				}
			}
			
		}
	}

}
