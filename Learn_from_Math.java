import java .util.*;
public class Learn_from_Math{
    
    public static boolean composite(int i)
    {
        int c=0;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
             c++;
             if(c>1)
             {
                 break;
             }
              return true;
            }
            
        }
       return false;
        
    }
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   
        int r=0;
        for(int i=4;i<n;i++)
        {
             if(composite(i)==true)
            {
                r=n-i;
            if (composite(r)==true)
            {
                System.out.print(i+" "+r);
                break;
            }
       
            }
        
            }
        
    }
}