import java.util.*;
public class max_fre_char {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),f="";
        int q=s.length(),c=0,min=Integer.MIN_VALUE;
        for(int i=0;i<q;i++)
        {
             c=0;
            for(int j=0;j<q;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                }
            }
            if(c>min)
            {
                min=c;
              f=s.charAt(i)+"";
            }
        }
        System.out.print(f);
    }
}
