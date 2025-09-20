
/*
 * Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */

import java.util.HashSet;
import java.util.Set;

class Longestsubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // Test the method
    public static void main(String[] args) {
        Longestsubstring sol = new Longestsubstring();
        String test = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + sol.lengthOfLongestSubstring(test));
    }
}
