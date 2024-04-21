import java.util.*;
public class  Candies_and_Two_Sisters
{
	public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
  int t=sc.nextInt(),c=0;
    for(int i=1;i<=t;i++)
    {
       int n=sc.nextInt();
      c= n/2;
      if(n%2==0)
      System.out.println(c-1);
      else
         System.out.println(c);
    }
}
}