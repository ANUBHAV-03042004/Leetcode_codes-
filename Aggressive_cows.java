import java.util.*;
public class Aggressive_cows {
    
        public static boolean check(int c,int a[],int n,int mid)
        {
            int co=1,pos=a[0];
            for(int i=1;i<n;i++)
            {
             if(a[i]-pos>=mid)
             {
                 pos=a[i];
                 co++;
             }
             if(co==c)
             {
                 return true;
             }
            }
            return false;
        }
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{//1 2 4 8 9
    a[i]=sc.nextInt();
}
Arrays.sort(a);
int start =0, end =a[n-1]-a[0],min=-1;

while(start<=end)
{
    int mid=start+((end-start)/2);
    if(check(c,a,n,mid)==true)
    {
        min=mid;
        start=mid+1;
    }
    else{
        end=mid-1;
    }
}
System.out.print(min);
    }
}

    