package week3.day3ass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


				
public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		ArrayList list=new ArrayList();
		for(int each:arr) {
			list.add(each);
		}
		System.out.println("Array into list " + list);
		
		//length
		int length=arr.length;
		System.out.println("length of list: " + length);
		
		int sumofarr=(length*(length+1))/2;
		// Sort the array	
		Collections.sort(list);
		
		int sum=0;
		for(int i=0;i<=length-2;i++) {
			sum+=arr[i];
			
			}
		
		int missele=sumofarr-sum;
		System.out.println("MissingElementInAnArray" + missele);	
		}
		
	
	
		
		

	}



