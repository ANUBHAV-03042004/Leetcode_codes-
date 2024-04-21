import java.util.*;
public class str_str_compression {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int q=s.length(),c=0,j=0;String e="";
        for(int i=0;i<q;i++)
        {
          char ch=s.charAt(i);
          char dh=s.charAt(j);
          if(ch==dh)
          {
              c++;
          }
          else{
              e+=dh;
              if(c>1)
              {
              e+=c;
              c=1;
              }
              j=i;
          }
         if(i==q-1)
         {
             e+=s.charAt(i);
             if(c>1)
             {
                 e+=c;
             }
         }
        }
        
 System.out.print(e);
    }
}