import java.util.*;
public class reverse_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        
       for(int j=a.length-1;j>-1;j--)
       {
           System.out.println(a[j]);
       }
    }
}