import java.util.*;
public class  New_Year_and_Hurry
{
	public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), k=sc.nextInt(),c=0,v=0,i=1,b=1;;
    while(n!=0)
    {
     c+=5*i;
    v=c+k;
    if(v<=240)
  {
      b++;
  }
 
     n--;
     i++;
    }
     System.out.print(b-1);
}
}