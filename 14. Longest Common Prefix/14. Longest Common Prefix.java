/*
 * Problem: 14. Longest Common Prefix
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/longest-common-prefix/submissions/2070136820/
 * Language: java
 * Date: 2026-07-16
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p = strs[0]; 
        for(int i = 0; i < strs.length;i++)
        {
            while(strs[i].indexOf(p) != 0)
            {
                p = p.substring(0, p.length() -1);
            }
        }
        return p;
        }

}
