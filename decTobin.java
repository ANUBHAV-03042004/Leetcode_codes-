// decimal to binary
import java.util.*;
public class decTobin
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int ans=0;
	    int mul=1;
	    //15==1111
	    while(n>0)
	    {
	    int rem=n%2;
	    ans+=rem*mul;
	    mul*=10;
	    n/=2;
	    }
	    System.out.print(ans);
	}
}
