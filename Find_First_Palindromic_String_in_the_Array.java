class Solution {
    public String firstPalindrome(String[] words) {
        String s="";
        for( String i:words)
        {
       if(palindrome(i)==true)
       {
           s=i;
           break;
       }
        }
       return s;
    }
    public boolean palindrome(String i)
    {
        for(int j=0;j<i.length()/2;j++)
        {
            if(i.charAt(j)!=i.charAt(i.length()-j-1)) return false;
        }
        return true;
    }
}
public class Find_First_Palindromic_String_in_the_Array
{
	public static void main(String[] args) {
	    Solution s=new Solution();
	    String words[]={"abc","car","ada","racecar","cool"};
	    System.out.println(s.firstPalindrome(words));
	}
}
