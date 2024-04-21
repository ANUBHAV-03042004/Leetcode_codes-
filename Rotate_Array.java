import java.util.*;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr1 = {5, 5, 4};
        int k1 = 1;
         rotate(arr1, k1);  

        int[] arr2 = {4, 3, 1, 1, 3, 3, 2};
        int k2 = 3;
        rotate(arr2, k2); 
    }

   public static void rotate(int[] nums, int k) {
        int n = nums.length, j = 0;
        int[] ans = new int[n];
        for (int i : nums) {
            ans[(j++ + k) % n] = i;
        }
       /* for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }*/
        System.out.println(Arrays.toString(ans));
         
    }
}
