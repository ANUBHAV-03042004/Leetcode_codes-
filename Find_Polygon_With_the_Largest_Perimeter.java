import java.util.*;
class Find_Polygon_With_the_Largest_Perimeter {
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
       if(nums.length<3) return -1; 
       if(nums.length==3) if(nums[0]+nums[1]>nums[2]) return (nums[0]+nums[1]+nums[2]);
       else return -1;
          long s=0,ans=0;
       if(nums.length>3) {
for(long i:nums){
if(s>i) ans=s+i;
s+=i;
if(ans==0) ans=-1;
}
       }
       return ans;
    }
    public static void main(String args[]) {
        int [] nums1 = {1,12,1,2,5,50,3};
        System.out.print(largestPerimeter(nums1));
}
}
