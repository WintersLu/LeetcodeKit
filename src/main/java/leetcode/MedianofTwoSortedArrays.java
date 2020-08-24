package leetcode;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] all = new int[nums1.length + nums2.length];
        for(int i1=0, i2=0, index=0; i1<nums1.length || i2<nums2.length; index++) {
            if (i1>=nums1.length) all[index] = nums2[i2++];
            else if(i2>=nums2.length) all[index] = nums1[i1++];
            else {
                all[index] = nums1[i1] > nums2[i2] ? nums2[i2++]:nums1[i1++];
            }
        }
        double result = 0;
        int count = (nums1.length + nums2.length);
        if(count%2 == 0) result = (double)(all[count/2] + all[count/2-1])/2;
        else result = all[count/2];

        return result;
    }
}