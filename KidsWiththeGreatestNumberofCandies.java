/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class KidsWiththeGreatestNumberofCandies
{
	public static void main(String[] args) {
	   int [] candies = {2,3,5,1,3};int extraCandies = 3;
	ArrayList<Boolean> ans=new ArrayList<>();
int max=Integer.MIN_VALUE;
        for(int i:candies)
        {
         max=Math.max(max,i);
        }
for(int i:candies)
{
    if(i+extraCandies>=max) ans.add(true);
    else ans.add(false);
}
System.out.print(ans);
	}
}
