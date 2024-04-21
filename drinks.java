import java.util.*;
public class drinks
{
	public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   
   int n=sc.nextInt();
   int a[]=new int[n+1];
   int r=0;
   double s=0;
   for(int i=1;i<=n;i++)
   {
        a[i]=sc.nextInt();
        r+=a[i];
   }
   s=(double)r/n;
   System.out.printf("%,.12f",s);


   sc.close();
}
}