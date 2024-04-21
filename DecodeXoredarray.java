/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class DecodeXoredarray
{
    public static void main(String[] args) {
        int []encoded={1,2,3};
        int first=1;
 int ans[]=new int[encoded.length+1];
        ans[0]=first;
        for(int i=1;i<ans.length;i++)
        {
            ans[i]=encoded[i-1] ^ ans[i-1];
        }
        System.out.print(Arrays.toString(ans));
	
	}
}