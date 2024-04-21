import java.util.*;
public class input_elements_till_sum_become_zero
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n=1,r=0;
	while(n!=0)
	{
	    int n1=sc.nextInt();
	    if(r+n1!=0)
	    {
	        r+=n1; 
	        System.out.print(n1);
	    }
	    else{
	        break;
	    }
	}
	

sc.close();
	}
	
}