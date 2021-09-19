package array;
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
public class Largest_sum_contiguous_subarray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		int sum = kadaneSum(arr);
		System.out.println(sum);
	}
	
	private static int kadaneSum(int[] arr) {
		int n = arr.length;
		int currSum = 0;
		int max_so_far = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			currSum += arr[i];
			if(max_so_far < currSum) {
				max_so_far = currSum;
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return max_so_far;
	}

}
