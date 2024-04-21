import java.util.*;
public class str_odd_even_char {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),c="";
        int q=s.length(),d=0;
     for(int i=0;i<q;i++)   
        {
            d=(int)s.charAt(i);
            if((i+1)%2!=0)
            {
              c=(char)(d+1)+"";
              System.out.print(c);
            }
            else{
                c=(char)(d-1)+"";
                System.out.print(c);
            }
        }
    }
}
