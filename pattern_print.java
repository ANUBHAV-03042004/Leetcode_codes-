/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
import java.util.*;
public class pattern_print
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the rows of pattern:-");
int n=sc.nextInt();
int c=1;
for(int i=1;i<=n;i++)
{
    for(int j=n-i;j<n;j++)
    {
        System.out.print(c+" ");
         c++;
    }
    System.out.println();
   
}
}
}
 