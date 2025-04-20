package week4.day2;


import java.util.Set;
import java.util.TreeSet;

public class IntersectionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Integer> test= new TreeSet <Integer>();
		test.add(3);
		test.add(2);
		test.add(11);
		test.add(4);
		test.add(6);
		test.add(7);
		
		System.out.println(test);
		
		Set <Integer> test1= new TreeSet <Integer>(); 
		
		test1.add(1);
		test1.add(2);
		test1.add(8);
		test1.add(4);
		test1.add(9);
		test1.add(7);
		System.out.println(test1);
		
		
		test.retainAll(test1);
		
		System.out.println("Common numbers between two collections " + test);
				
				
			
		}
		

	}


