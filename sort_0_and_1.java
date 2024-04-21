import java.util.*;
public class sort_0_and_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<t;j++)
        {
            for(int k=j+1;k<t;k++)
            {
                if(arr[j]>arr[k])
                {
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
            System.out.print(arr[j]+" ");
        }

    }
}