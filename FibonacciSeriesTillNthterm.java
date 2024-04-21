
//FIBONACCI SERIES

import java.util.*;
public class FibonacciSeriesTillNthterm
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int a=0;
	    int b=1;
	    int n=sc.nextInt();
	    int sum=0;
	    if(n==0) System.out.print("0");
	    if(n==1) System.out.print(a+",");
	    else if(n==2) System.out.print(a+","+b+",");
	    else{
	         System.out.print(a+","+b+",");
	    for(int i=0;i<n-2;i++)
	    {
	         sum=a+b;
	        System.out.print(sum+",");
	          a=b;
	        b=sum;
	    }
	    }
	}
}