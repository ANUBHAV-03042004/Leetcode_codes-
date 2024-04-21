import java.util.*;
public class circular_sum {
    public static int circular(int a[],int n)
    {
        int m=a[0];// [8 -8 9 - 9 10 -11 12]
        for(int i=0;i<n;i++)
        { 
            int sum=a[i],max=a[i];
            for(int j=1;j<n;j++)
            {
                int ind=(i+j)%n;
                sum+=a[ind];
                max=Math.max(max,sum);
            }
            m=Math.max(max,m);
        }
        System.out.print(m);
        return 0;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),s=0;
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
circular(a,n);

    }
    }
}