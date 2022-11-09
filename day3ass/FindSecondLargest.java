package week3.day3ass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//Here is the input
		//int[] data = {3,2,11,4,6,7};

/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		ArrayList lis=new ArrayList() ;
		for(int each:data) {
			lis.add(each);
		}
		System.out.println("Array into list: " + lis);
		
		//length
		int length=data.length;
		System.out.println("length of list: " + length);
		//Arrange the array in ascending order
		Collections.sort(lis);
		
		System.out.println("SecondLargest element : " + data[length-1]);
		
		

	}

	

}
