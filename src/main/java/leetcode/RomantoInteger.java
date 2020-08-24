package leetcode;

public class RomantoInteger {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public int romanToInt(String s) {
        int result= 0;

        for(int i=0; i<s.length(); i++){
            if(i+1<s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i+1))) {
                result -= getValue(s.charAt(i));
            }else {
                result += getValue(s.charAt(i));
            }
        }
        return result;
    }

    public int getValue(char s){
        switch(s){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}