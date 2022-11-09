package week3.day3ass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) {
		int[] a=  {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		//List<int> learners = new ArrayList<int>();
		ArrayList lis=new ArrayList() ;
		for(int each:a) {
			lis.add(each);
		}
		System.out.println("Array into list1: " + lis);
		ArrayList lis1=new ArrayList();
		for(int each:b) {
			lis1.add(each);
		}
		System.out.println("Array into list2: " + lis1);
        //length 
		int length=a.length;
		System.out.println("length of list1: " + length);
		
		int length1=b.length;
		System.out.println("length of list2: " +  length1);
		
		for(int i=0;i<=length-1;i++) {
			for(int j=0;j<=length1-1;j++) {
				if(a[i]==b[j]) {
					System.out.println("  Array matchs with both"+a[i]);
				}
			}
		}
	}

}
