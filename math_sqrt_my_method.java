import java.util.*;
public class math_sqrt_my_method {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
        double s=(Math.sqrt(n));
        double q=Math.floor(s*10000)/10000;
        
        System.out.printf("%.4f\n",q);

        }
        
    }
}
