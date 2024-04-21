import java.util.*;
public class array_target_sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        Arrays.sort(a);
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                for(int l=k+1;l<n;l++)
                {
                    if(a[j]+a[k]+a[l]==tar)
                    {
                        System.out.println(a[j]+", "+a[k]+" and "+a[l]);
                        l++;
                    }
                }
            }
        }

    }
}