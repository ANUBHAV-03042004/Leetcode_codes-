import java.util.*;
public class soldiers_and_bananas
{
	public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   
   int k=sc.nextInt();//price of banana
  int n=sc.nextInt();//amount 
  int w=sc.nextInt();//no.of of banana
  int s=0,rem=0;
   for(int i=1;i<=w;i++)
   {
       s+=i*k;
   }
   rem=s-n;
    if(s<=n)
   {
       System.out.print("0");
   }
   else{
   System.out.print(rem);
  
   }
  
   
   sc.close();
}
}