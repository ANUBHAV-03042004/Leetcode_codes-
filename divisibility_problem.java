import java.util.*;
public class divisibility_problem
{
	public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
 int c=0;
 int a[]=new int[100000009];
 int b[]=new int[100000009];
 int d[]=new int[100000009];
 
for(int i=1;i<=t;i++)
{
     a[i]=sc.nextInt();
    b[i]=sc.nextInt();
    int b1=b[i],a1=a[i];
     c=0; 
    while(b1!=0)
{
    if(a1%b[i]!=0)
    {
        a1+=1;
        c++;
    }
    b1--;
    d[i]=c;
}
}
for(int i=1;i<=t;i++)
{
System.out.println(d[i]);
}
   sc.close();
}
}