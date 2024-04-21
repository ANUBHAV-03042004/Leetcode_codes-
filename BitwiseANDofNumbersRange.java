/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class BitwiseANDofNumbersRange
{
	public static void main(String[] args) {
int left=5,right =7;
    int shift = 0;
    while (left < right) {
        left >>= 1;
        right >>= 1;
        shift++;
    }
    System.out.print(left << shift);
    }
}
//01111111111111111111111111111111