package week4.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <Integer> option= new TreeSet <Integer>();
		
		option.add(3);
		option.add(2);
		option.add(11);
		option.add(4);
		option.add(6);
		option.add(7);
		System.out.println(option);
		
		
		Optional<Integer> first = option.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(first.get());
	}
	

}
