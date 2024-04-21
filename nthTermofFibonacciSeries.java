import java.util.*;
public class nthTermofFibonacciSeries
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int a=0;
	    int b=1;
	    int n=sc.nextInt();
	    int sum=0;
	    for(int i=1;i<n;i++)
	    {
	         sum=a+b;
	          a=b;
	        b=sum;
	    }
	     System.out.print(a);
	}
}
