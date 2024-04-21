/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class way_too_long
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;
		String s[]=new String[n+1];
		for(int i=0;i<=n;i++)
		{
		    s[i] =sc.nextLine();
		    
		}
		while(j<=n)
		{
		    if(s[j].length()<=10)
		    {
		        System.out.println(s[j]);
		          j++;
		    }
		    else{
		        System.out.print(s[j].charAt(0));
		        System.out.print(s[j].length()-2);
		        System.out.println(s[j].charAt(s[j].length()-1));
		        j++;
		    }
		  
		}
	}
}
