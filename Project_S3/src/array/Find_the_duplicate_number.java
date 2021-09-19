package array;
//https://leetcode.com/problems/find-the-duplicate-number/
public class Find_the_duplicate_number {

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		int ans = findDuplicateNumber(nums);
		System.out.println(ans);
	}

	//cycle sort
	private static int findDuplicateNumber(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			while(nums[i] != i+1) {
				if(nums[i] == nums[nums[i] - 1]) return nums[i];
				//swap
				int tmp = nums[nums[i]-1];
				nums[nums[i]-1] = nums[i];
				nums[i] = tmp;
			}
		}
		return -1;
	}

}
