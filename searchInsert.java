class searchInsert {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length==1)
        {
       if(target>nums[nums.length-1]) return nums.length;
        else if(target<=nums[0]) return 0;
        }
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]==target) return i;
        else if(target>=nums[i] && target<=nums[i+1]) return i+1;
        else if(target>nums[nums.length-1]) return nums.length;
        else if(target<=nums[0]) return 0;
       }
       return 0;
    }
	public static void main(String[] args) {
	    int nums[]={1,3,5,6};
	    int target=5;
		System.out.println(searchInsert(nums,target));
	}
}
