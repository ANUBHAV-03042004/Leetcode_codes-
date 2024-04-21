import java.util.*;
public class Holiday_Of_Equality
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),max=0,x=Integer.MIN_VALUE,d=0;
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    if(arr[i]>x)
		    {
		        x=arr[i];
		    }
		}
		for(int j=0;j<n;j++)
		{
		 d+=(x-arr[j]); 
		}
	System.out.print(d);	
	}
}
