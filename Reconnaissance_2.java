/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// 34A,38A
//Reconnaissance 2
import java.util.*;
public class Reconnaissance_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE,d=0,st=0,end=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
         for(int j=0;j<n;j++)
        {
         d=Math.abs(a[j%n]-a[(j+1)%n]);
        if(d<min)
        {
            min=d;
            st=(j%n)+1;
            end=((j+1)%n)+1;
        }
        }
         System.out.println(st+" "+end); 
  
         
	}
}
