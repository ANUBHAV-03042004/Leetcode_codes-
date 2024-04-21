import java.util.*;
public class bubble_sort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
      
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
           
            for(int k=j+1;k<n;k++)
            {
                if(a[j]>a[k])
                {
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                
                }

            }
        
        }
        for(int l=0;l<n;l++)
        {
            System.out.println(a[l]+" ");
        }

    }
}