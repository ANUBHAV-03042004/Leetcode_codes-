import java.util.*;
public class Alex_shopping {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
int t=sc.nextInt();
while(t-->0)//100 100 200 400
{
int A=sc.nextInt(),c=0,k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(A%a[i]==0)
            {
                c++;
            }
        }
if(c>=k)
{
    System.out.println("Yes");
}
else{
    System.out.println("No");
}

}  
}
}