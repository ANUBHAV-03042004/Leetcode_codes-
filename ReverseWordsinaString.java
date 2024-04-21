
import java.util.*;
public class ReverseWordsinaString
{
	public static void main(String[] args) {
	String s = "a good  example";
	  String ans[]= s.split("\\s+"),res="";
	  for(int i=0;i<ans.length;i++)
	  {
	     
	      res+= ans[ans.length-1-i]+" ";
	     
	  }
	   res=res.trim();
	  System.out.print(res);
	  
	  
	}
}
