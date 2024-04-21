import java.util.*;
public class  Insomnia_cure
{
	public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
  int k=sc.nextInt(),l=sc.nextInt(),m=sc.nextInt(),n=sc.nextInt(),d=sc.nextInt(),c=0;
    for(int i=1;i<=d;i++)
    {
        if(i%k==0)
        {
            c++;
        }
        else if(i%l==0)
        {
            c++;
        }
        else if(i%m==0)
        {
            c++;
        }
        else if(i%n==0)
        {
            c++;
        }
        
    }
    System.out.print(c);
}
}