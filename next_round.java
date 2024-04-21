/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class next_round
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int c=0;
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	k--;
for(int i=0;i<n;i++)
	{
	    if(arr[i]>=arr[k]&& arr[i]>0)
	    {
	        c++;
	    }
	}
	System.out.print(c);
	}
}
