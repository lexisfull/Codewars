package task;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbcbabbcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        int start = 0;
        int end = 0;

        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            if(set.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(start));
                start ++;
            }
        }
        return maxLength;
    }
}
