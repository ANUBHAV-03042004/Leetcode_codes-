import java.util.*;
public class chewbacca_number
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	long t=sc.nextLong();
	int w=(int)Math.log10(t)+1;
	 long r=0;
	for(int i=0;i<w;i++)
	{
	    long e=t%10;
	    	long q= 9-e;
	if(q<5 && t!=9)
	{
	    
	    r=r+(q*(long)Math.pow(10,i));
	
	}
	else{
	   	r=r+(e*(long)Math.pow(10,i)); 
	   	
	}
	t=t/10;
	}
	
		System.out.print(r);
	}
}
/*
long t=sc.nextLong();
int ans=0;
int mul=1;
while(t!=0)
{
    long rem=t%10;
    if(rem>=5 && t!=9){
        long k=9-rem;
        ans+=k*mul;
    }
    else{
        ans+=rem*mul;
    }
    t/=10;
    mul*=10;
}
System.out.print(ans);
}
}*/
    
