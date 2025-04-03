package week1.day2;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;
		int count = 0;

		for (int i = 1; i<= num; i++) {

			if(num%1 ==0)

			{
				count ++;
			}
		}

		if (count ==3)

			System.out.println(  "is a prime");

		else

			System.out.println("not a prime number");


	}
}

