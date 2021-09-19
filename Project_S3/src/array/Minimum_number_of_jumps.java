package array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
public class Minimum_number_of_jumps {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 6, 7};
		int ans = minimumJump(arr);
		System.out.println(ans);
	}
	
	private static int minimumJump(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(j + arr[j] >= i) {
					dp[i] = Math.min(dp[i], dp[j]+1);
				}
			}
		}
		return dp[n-1];
	}

}
