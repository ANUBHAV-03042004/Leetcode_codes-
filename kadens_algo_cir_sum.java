import java.util.*;
public class kadens_algo_cir_sum{
    
    private static int kadens(int arr[])
    {
        int m=arr[0];
        for(int i=0;i<arr.length;i++)
        { 
            int max=arr[i];
        int s=arr[i];
            for(int j=1;j<arr.length;j++)
            {
                int ind=(i+j)%arr.length;
          s+=arr[ind];
          max=Math.max(s,max);
            }
           m=Math.max(m,max); 
        }
       
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        System.out.println(kadens(a));
        }
    }
    
}