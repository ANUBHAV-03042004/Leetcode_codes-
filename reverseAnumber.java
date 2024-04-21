import java.util.*;
public class reverseAnumber
{
	public static void main(String[] args) {
// reverse a number 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0;
int c=0;
while(n>0)
{
    rem=n%10;
    c=c*10+rem;
    n=n/10;
}
    System.out.print(c);
}
}
