import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
       if (nums.length == 0) return 0;
        int i=0;
        for(int j:nums)
        {
            if (j!= val) nums[i++] = j;
        }
        return i;
    }
}
public class remove_element
{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val=2;
        int k = solution.removeElement(nums ,val);
        System.out.println("k = " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}