/**
 *
 * 283. Move Zeroes
 *     Given an array nums, write a function to move all 0's to the end of it while 
 *     maintaining the relative order of the non-zero elements.
 * For example:
 *     given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 
 *     12, 0, 0].
 * Note:
 *     1. You must do this in-place without making a copy of the array.
 *     2. Minimize the total number of operations.
 * 
 */

import java.util.*;

public class Solution {
	public void moveZeroes(int[] nums) {
		int i = 0, j = 0;
		while (j < nums.length) {
			if (nums[j] == 0) {
				++j;
				continue;
			}
			nums[i++] = nums[j++];
		}
		
		while (i < nums.length) {
			nums[i++] = 0;
		}
	}
}