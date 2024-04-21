class Maximumsumwithkelements {
    public static int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
       // int ans=0;
        for(int i:nums)
        {
max=Math.max(max,i);
        }
//     for(int i=0;i<k;i++)
//     {
//    ans+=max+i;
//     }
    //return ans;
   return max*k+(k*(k-1)/2);
    }
    public static void main(String args[])
    {
        int k=3;
        int nums[]={1,2,3,4,5};
        System.out.print(maximizeSum(nums,k));
    }
}