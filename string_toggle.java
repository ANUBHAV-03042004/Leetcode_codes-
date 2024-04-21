import java.util.*;
public class string_toggle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int q=s.length(),i=0;
        String w="";
        while(q>i)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
               w= w.concat(Character.toLowerCase(s.charAt(i))+"");
            }
            else{
                w=w.concat(Character.toUpperCase(s.charAt(i))+"");
            }
            i++;
        }
        System.out.print(w);
    }
}
