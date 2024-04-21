class BinarySubarraysWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int c=0,sum;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==goal) c++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        int nums[]={1,0,1,0,1};
        int goal=2;
        System.out.print(numSubarraysWithSum(nums,goal));
    }
}