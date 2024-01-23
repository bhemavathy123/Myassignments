package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

			List<String> n1=new ArrayList<String>();
			n1.add("HCL");
			n1.add("Wipro");
			n1.add("Aspire Systems");
			n1.add("CTS");
			
			Collections.sort(n1);
			Collections.reverse(n1);
			System.out.println(n1);
				}

}
