import java.util.*;
public class PASSWORD_CHECKER {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     s=s.trim();
     int c=0,u=0,q=0,e=0;
if(s.length()<5)  System.out.println("Too weak");
else 
{
    for(char i:s.toCharArray())
    {
        if(Character.isDigit(i)) c++;
        else if(Character.isUpperCase(i)) u++;
        else if(Character.isLowerCase(i)) q++;
    }
    if(c>0 && u>0 && q>0)     System.out.println("Correct");
    else     System.out.println("Too weak");
}
    }
}