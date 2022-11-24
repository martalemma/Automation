package assignment;

import java.util.Set;
import java.util.TreeSet;

public class SortArrayInt {

	public static void main(String[] args) {
		 
		
		int[] array={4, 6, 8, 10, 7, 5, 1, 3, 2, 9}; 

		
		Set<Integer> MyC = new TreeSet<Integer>();
		
	    for(int item : array) {
	    	
	    	MyC.add(item);
	    }
		System.out.println(MyC);	

	}
}
