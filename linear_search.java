import java.util.*;
public class linear_search {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=0;
        int a[]=new int[n];
        boolean g=false;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        for(int j=0;j<n;j++)
        {
            if(a[j]==target)
            {
                q=j;
                 g=true;
            }
        }
        if(g==true)
        {
            System.out.print(q);
        }
        else{
            System.out.print(-1);
        }
        
    }
    
}