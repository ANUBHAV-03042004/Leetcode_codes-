import java.util.*;
public class gcdofstring
{
	public static void main(String[] args) {
String str1 = "ABABABAB", str2 = "ABAB";
    if(!(str1+str2).equals(str2+str1)) System.out.print("");
    else{
        int a=str1.length(),b=str2.length();
      while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
         System.out.print(str1.substring(0,a));
    }
}
}
