/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class isPowerOfTwo
{
	public static void main(String[] args) {
int n=16;
        if (n<=0) System.out.print(false);
System.out.print((n & (n-1))==0);
    }
}
