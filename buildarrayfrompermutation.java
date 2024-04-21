/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class buildarrayfrompermutation
{
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
  int ans[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
		System.out.println(Arrays.toString(ans));
	}
}
