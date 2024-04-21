
// decimal addition 35921=3+5+9+2+1=20
import java.util.*;
public class decimal_addition
{
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0;
int c=0;
while(n>0)
{
    rem=n%10;
    c=c+rem;
    n=n/10;
}
    System.out.print(c);
}
}
