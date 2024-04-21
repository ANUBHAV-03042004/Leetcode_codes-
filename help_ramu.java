import java.util.*;
public class help_ramu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
    while(t-->0)
        {
           int c1=sc.nextInt(),c2=sc.nextInt(),c3=sc.nextInt(),c4=sc.nextInt(); 
           int n=sc.nextInt(),m=sc.nextInt(), min1=0,min2=0,t_min=0;
           while(n-->0)
           {
               int a=sc.nextInt();
           min1+=Math.min(a*c1,c2);
           }
           min1=Math.min(min1,c3);
           while(m-->0)
           {
               int b=sc.nextInt();
               min2+=Math.min(b*c1,c2);
           }
        min2=Math.min(min2,c3);
        t_min=Math.min(min1+min2,c4);
        System.out.println(t_min);
  
}
}
}