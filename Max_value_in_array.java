import java.util.*;
public class Max_value_in_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),max=Integer.MIN_VALUE;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
        if(a[j]>max)
              {
                 max=a[j]; 
              }
        }
        
 System.out.print(max);
    }
}