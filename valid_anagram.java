import java.util.*;
public class valid_anagram
{
	public static void main(String[] args) {
	 String a="anagram",b="nagaram";
	char z[]=a.toCharArray();
		char x[]=b.toCharArray();
		if(a.length()!=b.length())  System.out.print("false");
	  Arrays.sort(z);
	 Arrays.sort(x);
	 
	 int j=0;
	 for(char i:z)
	 {
	     if(i!=x[j++]) System.out.print("false");
	 }
	 System.out.print("true");
	}
}
