import java.util.*;
public class sum_of_round_numbers
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),c=1,i=0;
		while(t-->0)
		{
		    
		     c=0;
		     i=0;
		    int n = sc.nextInt();
		        ArrayList<Integer> g = new ArrayList<Integer>();
		    while(n!=0)
		    {
		        int d=n%10;
		        if(d!=0)
		        {
		       int s=d*(int)Math.pow(10,c+i);
		         c++; 
		       g.add(s);
		       
		        }
		        else{
		            i++;
		           
		        }
		        n/=10;
		       
		    }
		    if(c==0)
		    {
		        c=1;
		    }
		    	System.out.println(c);
		    	for(int b:g)
		    	{
		    	    System.out.print(b+" ");
		    	}
		    		System.out.println();
		}
	
	
		

	
	
	}
}
