/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// 34A,38A
//army
import java.util.*;
public class army
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        int d[]=new int[n];
      for(int i=0;i<n-1;i++)
      {
          d[i]=sc.nextInt();
      }
  int a=sc.nextInt(),b=sc.nextInt();
for(;a<b;a++)
      {
      s+=d[a-1];  
      }
    System.out.print(s);
	}
}
