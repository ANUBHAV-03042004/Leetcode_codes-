/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class replaced_string
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
String s=sc.nextLine(),check="aeiouy";
s=s.toLowerCase();
for(char i:s.toCharArray())
{
    if(check.contains(Character.toString(i))) s=s.replace(Character.toString(i),"");
    else s=s.replace(Character.toString(i),"."+Character.toString(i));
}
System.out.print(s);
	
	}
}
