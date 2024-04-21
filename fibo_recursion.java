/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class fibo_recursion
{
public static int fib(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
 else 
  return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
 System.out.print(fib(4));
	}
}
