import java.util.*;
class shuffle {
    public static int[] shuffle(int[] nums, int n) {
    int ans[]=new int[2*n];
    int j=0;
   for(int i=0;i<n;i++)
   {
   if(i%2==0) ans[i]=nums[j++];
   else ans[i]=nums[n++];
   }
   ans[ans.length-1]=nums[nums.length-1];
   return ans;
    }
public static void main(String args[])
{
    int nums[]={2,5,1,3,4,7};
    int n=3;
    System.out.print(Arrays.toString(shuffle(nums, n)));
    }
}