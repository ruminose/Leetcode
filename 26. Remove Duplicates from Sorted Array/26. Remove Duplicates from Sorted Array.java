/*
 * Problem: 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Language: java
 * Date: 2026-07-23
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j = 1; j < nums.length;j++)
        {
            if(nums[j] != nums[j-1])
            {
                nums[i] = nums[j];
                i++;
            }
        }
    return i;
    }
}
