package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        if(strs.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < strs[0].length(); i++) {
            char first = strs[0].charAt(i);
            for(int k=1;k<strs.length; k++){
                if(i >= strs[k].length()) {
                    return sb.toString();
                }
                if(strs[k].charAt(i) != first)
                    return sb.toString();
            }
            sb.append(first);
        }
        return sb.toString();
    }
}