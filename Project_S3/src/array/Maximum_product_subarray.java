package array;
//https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
public class Maximum_product_subarray {
	//kadane's algorithm
	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, -1, 0};
		
		int max_so_far = Integer.MIN_VALUE;
		int max_end_here = 1;
		int min_end_here = 1;
		for(int i=0; i<arr.length; i++) {
			int pre_max_end_here = max_end_here;
			int pre_min_end_here = min_end_here;
			if(arr[i] < 0) {
				min_end_here = Math.min(1, pre_max_end_here*arr[i]);
				max_end_here = Math.max(1, pre_min_end_here*arr[i]);
			} else if(arr[i] > 0) {
				min_end_here = Math.min(1, pre_min_end_here*arr[i]);
				max_end_here = Math.max(1, pre_max_end_here*arr[i]);
			} else {
				max_end_here = 1;
				min_end_here = 1;
			}
			
			if(max_so_far < max_end_here) {
				max_so_far = max_end_here;
			}
		}
		
		System.out.println(max_so_far);
	}

}
