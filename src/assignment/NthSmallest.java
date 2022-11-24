package assignment;


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NthSmallest {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int max = 1000;
		int min = 100;
		int N = 1;
		int randomNum = rand.nextInt((max-min)+1)+min;
		
		Set<Integer> MyC = new TreeSet<Integer>();
		
		while(MyC.size() !=500) {
			MyC.add(rand.nextInt((max-min)+1)+min);
		}
		 
		Object[] random = MyC.toArray();
		System.out.println(random[N]);

	}

}
