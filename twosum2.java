/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class twosum2
{
	public static void main(String[] args) {
		int [] numbers = {2,3,3,4},ans=new int [2];int target = 6;
		boolean t=false;
		for(int i=0;i<numbers.length;i++)
		{
		    for(int j=i+1;j<numbers.length;j++)
		    {
		        if(numbers[i]+numbers[j]==target)
		        {
		            ans[0]=i+1;
		            ans[1]=j+1;
		            t=true;
		            break;
		        }
		    }
		    if(t) break;
		}
		System.out.print(Arrays.toString(ans));
	
	}
}
