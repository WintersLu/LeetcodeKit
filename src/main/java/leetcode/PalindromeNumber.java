package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x != 0)) return false;
        int re=0;
        while(x>0) {
            re = re * 10 + x % 10;
            x = x / 10;
        }
        return re == x;
    }
}