/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class team
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr=0;
		int c=0;
		int d=0;
	for(int i=1;i<=n;i++)
	{
	    c=0;
	    for(int j=1;j<=3;j++)
	    {
	        arr=sc.nextInt();
	        if(arr==1)
	        {
	            c++;
	        }
	    }
	    if(c>=2)
	    {
	        d++;
	    }
	}

System.out.print(d);
	
	}
}
