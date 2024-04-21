import java.util.*;
public class good_substring {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int q=s.length(),c=0;
for(int i=0;i<q;i++)
{
    for(int j=i;j<q;j++)
    {
        String sub=s.substring(i,j+1);
        int d=Integer.parseInt(sub,2);
        if(d==sub.length())
        {
            c++;
        }
    }
}
System.out.print(c);
    }
}