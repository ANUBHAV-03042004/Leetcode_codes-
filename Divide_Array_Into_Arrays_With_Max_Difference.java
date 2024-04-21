import java.util.*;
import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                result.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
            } else {
                return new int[0][0]; // Return empty 2D array if condition is not met
            }
        }
        
        // Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][]);
    }
}


public class Divide_Array_Into_Arrays_With_Max_Difference {
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
 int k = 2;
  Solution st =new Solution();
System.out.println(Arrays.deepToString(st.divideArray(nums, k)));

}
}
