/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class product_of_array_except_self
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int arr[]={1,2,3,4};
	   int n[]=new int[arr.length];
	    for(int i=0;i<arr.length;i++)
	    {
	        int s=1;
	    for(int j=0;j<arr.length;j++)
	    {
	        if(i!=j)
	        {
	            s*=arr[j];
	            
	    }
	    n[i]=s;
	       
	    }
	}
	   System.out.print(Arrays.toString(n));
}
}
