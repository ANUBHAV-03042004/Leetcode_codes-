import java.util.*;
public class inverted_array {
    public static int inverted(int arr[],int i,int n,int brr[])
    {
        if(i==arr.length)
        {
    return 99 ;
        }// 0 2 4 1 3=== 0 3 1 4 2
        else{
                int temp=arr[i];
                brr[temp]=i;
                  
            }
        return inverted(arr,i=i+1,n,brr);
        
        }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        int brr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
      inverted(arr,0,t,brr);
       for(int j=0;j<t;j++)
        {
            System.out.print(brr[j]+" ");
        }

    }
}