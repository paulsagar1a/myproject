package array;

import java.util.HashSet;
import java.util.Set;

//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
public class Longest_consecutive_subsequence {

	public static void main(String[] args) {
		int a[] = {2,6,1,9,4,5,3};
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++) set.add(a[i]);
		
		int max = 1;
		for(int i=0; i<a.length; i++) {
			if(!set.contains(a[i] - 1)) {
				int val = a[i];
				while(set.contains(val)) val++;
				
				if(max < val - a[i]) max = val - a[i];
			}
		}
		
		System.out.println(max);
	}

}
