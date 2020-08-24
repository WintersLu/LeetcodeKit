package leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public int maxArea(int[] height) {
        if(height.length <= 1) return 0;
        int start = 0;
        int end = height.length-1;
        int max = 0;

        while(start < end) {
            int current = Math.min(height[start], height[end]) * (end-start);
            max = Math.max(max, current);
            if(height[start] > height[end]) end--;
            else start++;
        }
        return max;
    }
}