/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class letter_combinations_of_phno
{
    public static List<String> letterCombinations(String digits) {
            ArrayList<String> a=new ArrayList<>();
            if(digits.length()==0) return a;
        for(char i:digits.toCharArray())
        {
           a.add(val(i));
        }
    ArrayList<String> ans = new ArrayList<>(Arrays.asList(""));
        for (String s : a) {
            ArrayList<String> temp = new ArrayList<>();
            for (String res : ans) {
                for (char c : s.toCharArray()) {
                    temp.add(res + c);
                }
            }
            ans= temp;
        }
              return ans;
    }
      public static String val(char ch)
    {
        if(ch=='2') return("abc");
        else if(ch=='3')  return("def");
        else if(ch=='4')  return("ghi");
        else if(ch=='5')  return("jkl");
        else if(ch=='6')  return("mno");
        else if(ch=='7')  return("pqrs");
        else if(ch=='8')  return("tuv");
        else if(ch=='9')   return("wxyz");
        else  return("");
        
    }
    	public static void main(String[] args) {
    	    String digits = "23";
    	    System.out.print(letterCombinations(digits));
    	    
    	    
    	    
}
}
