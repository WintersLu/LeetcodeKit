package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        Set<Character> set = new HashSet<>();

        for(int k=0, i=0; i<s.length(); i++){
            char current = s.charAt(i);

            while(set.contains(current)) {
                set.remove(s.charAt(k));
                k++;
            }
            set.add(current);

            result = Math.max(result, set.size());
        }
        return result;

    }
}