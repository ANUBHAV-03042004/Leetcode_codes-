import java.util.*;
public class long_palin_substring {
    public static boolean check(String sub)
    {
        int slen=sub.length();
        for(int k=0;k<slen/2;k++)
        {
            char ch=sub.charAt(k);
            char dh=sub.charAt(slen-k-1);
            
            if(ch!=dh)
            {
                return false;
            }

        }
        return true;
    }
public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s=sc.nextLine(),sub="",ans="";
     
        int w=s.length(),max=Integer.MIN_VALUE;
for(int i=0;i<w;i++)
{
    for(int j=i;j<w;j++)
    {
        sub=s.substring(i,j+1);
     
     if(check(sub)==true)
     {
         int len=sub.length();
         if(max<len)
         {
             ans=sub;
             max=len;
         }
        
     }
    }
    }
     System.out.println(ans);
         System.out.println(max);
        }
    }
}