import java.util.*;
class longest_valid_parenthesis {
    public static int longestValidParentheses(String s) {
        Stack<Integer>ans=new Stack<>();
        int c=0,max=0;
        ans.push(-1);
    for(char i:s.toCharArray())
    {
        if(i=='(') ans.push(c);
        else if(i==')')
        {
            ans.pop();
             if(ans.isEmpty()) ans.push(c);
             else max=Math.max(max,c-ans.peek());
        }
        c++;
    }
   return max;
    }
    public static void main(String args[])
    {
        String s=")()())";
        System.out.print(longestValidParentheses(s));
    }
}