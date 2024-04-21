/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class concatenationOfarray
{
    public static void main(String[] args) {
        int nums[]={1,2,3};
      int[] ans = Arrays.copyOf(nums, 2*nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
		System.out.println(Arrays.toString(ans));
	}
}
