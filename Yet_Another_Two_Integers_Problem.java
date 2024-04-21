import java.util.*;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        for(int i=0;i<t;i++)
        {
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
          int c=0;
        int n=Math.abs(a-b);
        c=n/10;
        if(n%10!=0)
        {
            n-=10;
            c++;
        }
        System.out.println(c);
          }
       
        
    }
}
        
        
     
      
     

