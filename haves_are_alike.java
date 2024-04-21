import java.util.*;
class haves_are_alike {
       public static boolean halvesAreAlike(String s) {
        int c=0,d=0,mid=s.length()/2;
  String ans="aeiouAEIOU",s1=s.substring(0,mid),s2=s.substring(mid);
        for(char i:s1.toCharArray())
        {
            if(ans.indexOf(i)!=-1) c++;
        }
          for(char i:s2.toCharArray())
        {
            if(ans.indexOf(i)!=-1) d++;
        }
        return c==d;
    }
    public static void main(String args[])
    {
      String s="textbook";
       
        System.out.print(halvesAreAlike(s));
        
    }
}
