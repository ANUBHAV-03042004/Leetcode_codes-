/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class max_no_ofword_in_sentences
{
    public static void main(String[] args) {
        String nums[]={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
 int max=0;
       for(String i:nums)
       {
      String ans[]=i.split(" ");
      	
      max=Math.max(max,ans.length);
      }
System.out.print(max);
	
	}
}