// Question

// 75. Sort Colors

// Medium

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

// Constraints:
// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

// Follow up: Could you come up with a one-pass algorithm using only constant extra space?

// ************************************************************************************************
// Solution

class SortColors {
	public void sortColors(int[] nums) {

		// Approach 1 --> Time -> O(colors * nums.length)
		// int j = 0;
		// for(int colors = 0; colors < 2; colors++){
		// for(int i = 0; i < nums.length; i++){
		// if(nums[i] == colors){
		// int temp = nums[j];
		// nums[j] = nums[i];
		// nums[i] = temp;

		// j++;
		// }
		// }
		// }

		// Approach 2 Time --> O(n) and space --> constant
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {
			if (nums[mid] == 0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;

				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else if (nums[mid] == 2) {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;

				high--;
			}
		}

	}

}