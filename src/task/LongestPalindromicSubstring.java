package task;

// не решено
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babkhjgfhjkgf"));
    }

    public static String longestPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        String sub;
        if (s != null && !s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    sub = s.substring(i, j);
                    System.out.println(sub);
                    if (sub.length() > 1 && sub.contentEquals(sb.append(sub).reverse().toString())) {
                        System.out.println(sub);
                    }
                }
            }
        }
        return null;
    }
}
