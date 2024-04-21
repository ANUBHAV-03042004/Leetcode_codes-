import java.util.*;
public class target_sum2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        Arrays.sort(arr);
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(arr[j]+arr[k]==tar)
                {
                    System.out.println(arr[j]+" and "+arr[k]);
                }
            }
        }

    }
}