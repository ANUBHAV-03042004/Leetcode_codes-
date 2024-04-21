/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class number_of_digit1
{
	public static void main(String[] args) {
int n=13,c=0;
   for (int i = 1;i <= n; i *= 10) 
    {
        int divider = i * 10;
         c+= (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
    }            
    System.out.print(c);
    }
}
