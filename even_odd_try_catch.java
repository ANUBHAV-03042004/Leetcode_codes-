import java.util.*;
public class even_odd_try_catch
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
	    int	n=sc.nextInt();
if(n>0 && n%2==0) System.out.print("even number");
else if(n>0 && n%2!=0) System.out.print("odd number");
else System.out.print("invalid number");   
}
	 catch(InputMismatchException e) {

	    System.out.print("invalid number");
	}
	}
}
