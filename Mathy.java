/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Mathy
{
    //10
    //4
    //1 2 3 4
  /* (1+2+3+4)=4
    (2+4+6)=3
    (3+6)=2
    (4)=1*/
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt(),c=0,s,p=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    s=0;
		    for(int j=1;s<=m;j++)
		    {
		        if(j*a[i]<=s)
		        {
		            s+=j*a[i];
		        }
		    }
		    
		}
		p=Math.max(p,s);
		System.out.print(p);
		
		
	}
}
