import java.util.*;
public class print_2d_array_columnwise
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
/*	int n=sc.nextInt();
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        a[i][j]=sc.nextInt();
	    }
	}*/
	/* 1  2  3  4
	}  5  6  7  8
	   9 10 11 12
	   13 14 15 16 *///========///*1 5 9 13 14 10 6 2 3 7 11 15 4 8 12 16
	   
	   //STRING//
	           /*  String s="Hello ";
	             String s1= "Hello";
	             System.out.println(s);
	             s=s.concat("A.K.S");
	             System.out.println(s);
	             String s2=new String("Hello");
	             System.out.println(s2);
	             System.out.println(s==s1);
	             System.out.println(s==s2);*/
	            
	            
	            
	        /*    String s="abc";
	            String s1= "abc";
	            s=s.concat(s1);
	           System.out.println(s);
	           String s2="abc"+"abc";
	           System.out.println(s2);
	           System.out.println(s1==s2);
	           String s4="abcabc";
	           System.out.println(s==s2);
	           System.out.println(s2==s4);*/
	          /*String s="hello";
	           System.out.println(s.length());
	           System.out.println(s.charAt(2));
	           System.out.println(s.contains("llo"));
	           System.out.println(s.lastIndexOf("l"));
	           System.out.println(s=s.replace('h','k'));
	           System.out.println(s.toUpperCase());
	           System.out.println(s.toLowerCase());*/
	           //starts with//
	           //ends with//
	           
	           
	           
	           // substring//
	          /* String s="hello";
	           System.out.println(s.substring(1));
	           System.out.println(s.substring(1,2));*/
	           String s="hello";
	 for(int i=0;i<s.length();i++)
	{
	    for(int j=0;j<s.length();j++)
	    {
	       String str=s.substring(i,j);
	       if(ispalindrome(str)==true)
	       {
	           System.out.println(str);
	       }
	    }
	}
	           
}
private static boolean ispalindrome(String str)
{
    int st=0;
    int ed=str.length()-1;
    while(st<ed)
    {
        if(str.charAt(st)!=str.charAt(ed))
        {
            return false;
        }
       st++;
        ed--;
    }
    return true;
}
}