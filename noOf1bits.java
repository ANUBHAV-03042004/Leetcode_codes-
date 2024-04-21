/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class noOf1bits
{
    public static void main(String[] args) {
        int n=11;
     int d=0;
        while(n>0){
           n &= (n-1);
           d++;
        }
        System.out.print(d);
	
	}
}