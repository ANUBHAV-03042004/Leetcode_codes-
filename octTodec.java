//octal addition
//35721=15313
import java.util.*;
public class octTodec
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0;
int c=0;
int i=0;
//int b=(int)Math.log10(n)+1;
while(n>0)
{
    rem=n%10;
   c=c+rem*(int)Math.pow(8,i);
    n=n/10;
    i++;
}
    System.out.print(c);
}
}
