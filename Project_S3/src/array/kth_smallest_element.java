package array;
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)
//Quick Select Algorithm - best case O(N) | worst case O(N*N)
public class kth_smallest_element {

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 20, 15};
		int k = 2;
		int ans = kthSmallestElement(arr, 0, arr.length - 1, k);
		System.out.println(ans);
	}

	private static int kthSmallestElement(int[] arr, int lo, int hi, int k) {
		int pivot = arr[hi];
		int pi = partition(arr, pivot, lo, hi);
		
		if(pi < k-1) {
			return kthSmallestElement(arr, pi+1, hi, k);
		} else if(pi > k-1) {
			return kthSmallestElement(arr, lo, pi-1, k);
		} else {
			return arr[pi];
		}
	}
	
	private static int partition(int[] arr, int pivot, int lo, int hi) {
		int i = lo, j = lo;
		while(i<=hi) {
			if(arr[i] <= pivot) {
				//swap
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j-1;
	}

}
