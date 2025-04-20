package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <String> option = new ArrayList <String>();
		
		
		option.add("HCL");
		option.add("Wipro");
		option.add("Aspire Systems");
		option.add("CTS");
	
		
		List<String> sorted = option.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sorted);
		
		
	}

}
