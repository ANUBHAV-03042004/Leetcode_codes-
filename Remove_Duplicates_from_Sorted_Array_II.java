import java.util.*;
class Solution {
     public int removeDuplicates(int[] nums) {//[0,0,1,1,1,1,2,3,3] i=3
        int j=0;// 6                           [0,1,2,3,4,5,6,7,8]
        for(int i:nums)                      //[0,0,1,1,2,3,3,3,3]
        {
            if(j<2||i>nums[j-2]) nums[j++]=i;//
         }
return j;
    }
}
public class Remove_Duplicates_from_Sorted_Array_II
{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = solution.removeDuplicates(nums);
        System.out.println("k = " + k);
        }
    }