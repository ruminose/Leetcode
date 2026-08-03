/*
 * Problem: 27. Remove Element
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-element/description/
 * Language: java
 * Date: 2026-08-03
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != val)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
