import java.util.*;
public class pair_of_roses {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
 while(t!=0)
 {
     int q=sc.nextInt();
     int n[]=new int[q+1];
     for(int j=0;j<n.length-1;j++)
     {
          n[j]=sc.nextInt();
     }
 
     int w=sc.nextInt();
     Arrays.sort(n);
    for(int e=0;e<n.length-1;e++)
     {
         if(n[e]+n[e+1]==w)
         {
             
         System.out.println("Deepak should buy roses whose prices are "+n[e]+" and "+n[e+1]+".");
         }
       
         
         }
         t--;
     
 }
 
sc.close();
    }
}