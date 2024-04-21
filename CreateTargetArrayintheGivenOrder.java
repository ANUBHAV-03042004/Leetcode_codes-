import java.util.*;
class CreateTargetArrayintheGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
    	ArrayList<Integer>ans=new ArrayList<>();
	for(int i=0;i<nums.length;i++)
	{
	    ans.add(index[i],nums[i]);
	}
      for(int i=0;i<nums.length;i++)
      {
        index[i]=ans.get(i);
      }
      return index;
    }
    public static void main(String args[])
    {
        int []nums = {0,1,2,3,4};
        int index [] = {0,1,2,2,1};
        System.out.print(Arrays.toString(createTargetArray(nums,index)));
    }
}
