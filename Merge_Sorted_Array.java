import java.util.*;
class Merge_Sorted_Array {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m,j=n-1;
while(i<m+n)
{
    if(j>=0) nums1[i]=nums2[j--];
    i++;
}
Arrays.sort(nums1);
return nums1;
    }
    public static void main(String args[]) {
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = 3, n = nums2.length;
        System.out.print(Arrays.toString(merge(nums1, m, nums2, n)));
}
}
