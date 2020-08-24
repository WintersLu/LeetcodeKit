package leetcode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        longestPalindrome("a");
    }

    public static String longestPalindrome(String s) {
        String result = "";
        for(int i=0; i<s.length(); i++){
            String r1 = sublong(s, i, i);
            if(r1.length() > result.length()) result = r1;

            if(i<s.length()-1) {
                String r2 = sublong(s, i, i + 1);
                if (r2.length() > result.length()) result = r2;
            }
        }
        return result;
    }

    public static String sublong(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start+1, end);

    }
}