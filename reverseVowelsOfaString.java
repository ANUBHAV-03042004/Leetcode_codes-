import java.util.*;
class reverseVowelsOfaString{
  public static String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        String check="AEIOUaeiou";
        for(char i:s.toCharArray())
        {
            if(check.contains(Character.toString(i)))    st.push(i);
        }
        StringBuilder ans=new StringBuilder(s);
        while(!st.isEmpty())
        {
         for(int i=0;i<ans.length();i++)
        {
            if(check.contains(Character.toString(ans.charAt(i))))    ans.setCharAt(i,st.pop());
        }
        }
        return ans.toString();
    }
    public static void main(String args[])
    {
        String s="hello";
        System.out.print(reverseVowels(s));
    }
}
