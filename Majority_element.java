import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
      // int c=0,max=0,n=Integer.MIN_VALUE;
       if(nums.length==1) return nums[0];
      /*  for(int i=0;i<nums.length;i++)
        {
c=0;
          for(int j=i+1;j<nums.length;j++)
          {
              if(nums[i]==nums[j]) c++;
          }
          if(c>n)
          {
              n=c;
              max=nums[i];
          }
        }*/
        int c=0,max=0;
        for(int i:nums)//1 1 1 2 2 2 2
        {
            if(c==0) max=i;//0
            c+=(i==max)?1:-1;
        }
        return max;
    }
}
public class Majority_element{

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,2,1,1,1,2,2};  // Replace with your actual array
        int majorityElement = solution.majorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
    }
}

