//PRIME NUMBER
import java.util.*;
public class primeOrnot
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int c=0;
	    for(int i=2;i<n;i++)
	    {
	        if(n%i==0)
	        {
	            c++;
	            break;
	        }
	    }
	    if(c==0)
	    {
	         System.out.print("prime");
	    }
	    else{
	         System.out.print("not prime");
	    }
	   
	}
}