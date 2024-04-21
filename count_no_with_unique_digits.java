/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class count_no_with_unique_digits
{
	public static void main(String[] args) {
int n=2;
      if (n == 0)  System.out.print(1);;
        if (n == 1) System.out.print(10);;
        int ans = 10, c = 9;
        for (int i = 0; i < n - 1; ++i) {
            c *= (9 - i);
            ans += c;
        }
       System.out.print(ans);
    }
}
