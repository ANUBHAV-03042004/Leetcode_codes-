import java.util.*;
public class Math_sqrt_newton_method {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
       double epsilon=0.0001;
       double guess=n/2.0;
       while(Math.abs(guess*guess-n)>epsilon)
       {
           guess=(guess+(n/guess))/2.0;
       }
       double q=Math.floor(guess*10000)/10000;
       System.out.printf("%.4f\n",q);
        
        }
        
    }
}
