package array;

import java.util.HashSet;

//Triplet Sum in Array 
//https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
public class three_sum {

	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 10, 8};
		int X = 13;
		boolean ans = threeSum(arr, X);
		System.out.println(ans);
	}

	private static boolean threeSum(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<>();
		int n = arr.length;
		for(int i=0; i<n; i++) set.add(arr[i]);
		for(int i=0; i<n-2; i++) {
			int rem_sum = sum - arr[i];
			for(int j=i+1; j<n; j++) {
				int rem = rem_sum - arr[j];
				if(set.contains(rem)) return true;
			}
		}
		return false;
	}

}
