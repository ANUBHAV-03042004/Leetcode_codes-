import java.util.*;
public class palin_count {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         sc.nextLine(); 
        while(t-->0)
        {
        String s=sc.nextLine();
        int w=s.length()-1,c=0;
       int start=0,end=w;
while(start<end)
{
    if(s.charAt(start)==s.charAt(end))
    {
        start++;
        end--;
        c++;
        System.out.print(s.charAt(start)+""+s.charAt(end));
    }
    
    else{
        start++;
}
}

System.out.println(c);
        }
        
    }
}