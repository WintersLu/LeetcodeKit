package leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public int reverse(int x) {
        boolean neg = x < 0;
        if(neg) x = -x;

        String reverse = new StringBuilder("" + x).reverse().toString();
        try {
            int result = Integer.parseInt(reverse);
            if(neg) result = -result;
            return result;

        }catch (Exception e){
            return 0;
        }
    }

    public static int reverse2(int x) {
        boolean neg = x < 0;
        if(neg) x = -x;
        long result = 0;

        while(x > 0) {
            int bit = x % 10;
            x = x / 10;
            result = result * 10 + bit;
        }

        if(neg) result = -result;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
        else return (int) result;
    }
}