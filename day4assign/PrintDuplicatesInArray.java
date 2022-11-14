package week3.day4assign;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// print the matching value
			
	

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//System.out.println("given i/p:{14,12,13,11,15,14,18,16,17,19,18,17,20}");
		// get the length of the array
		int length=arr.length;
		System.out.println("length of arr" +length);
		
		// declare an int variable named count
		int count;
		
		Set<Integer> set = new TreeSet<Integer>();
		//System.out.println(set);
		
		for(int i=0;i<=arr.length-1;i++) {
			boolean add=set.add(arr[i]);
			if(!add) {
				System.out.println("duplicates : " + arr[i]);
			}
		}
		
		
		

	}

}
