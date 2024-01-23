package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> n1=new ArrayList<Integer>();
		n1.add(3);
		n1.add(2);
		n1.add(11);
		n1.add(4);
		n1.add(6);
		n1.add(7);
		
		Collections.sort(n1);
		System.out.println(n1);
		Integer integer = n1.get(4);
		System.out.println(integer);
		

	}

}
