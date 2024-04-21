import java.util.*;
public class boston_number
{
public static int sum(int n)
{
     int s=0;
     if(n<4)
     {
         s=1;
     }
    while(n!=0)
    {
        int d=n%10;
     s+=d;
     n/=10;
    }
    return s;
}
public static int factor(int t)
{
    int i=2,r=0;
    
    while(t>1)
    {
       if(t%i==0)
       {
           if(i<=9)
           {
           r+=i;
           t/=i;
           }
           else
           {
               int y=i;
               while(y!=0)
               {
                   int u=y%10;
                   r+=u;
                   y/=10;
               }
               t/=i;
           }
       }
       else{
           i++;
       }
    }
    
    return r;
}
public static boolean prime(int n)
{
   int f=0;
   if(n<=1)
   {
       return false;
   }
    for(int e =2;e<n;e++)
    {
        if(n%e==0)
        {
             return false;
        }
        
    }
     return true;
}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int t=sc.nextInt();
	int n=t; 
if(prime(n)==true)	
{
     System.out.print("0");
}
 else if(sum(n)==factor(t))
	{
	    System.out.print("1");
	}
	else{
	    System.out.print("0");
	}
	
	}
}