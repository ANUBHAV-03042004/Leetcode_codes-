import java.util.Arrays;
public class IsomorphicStrings {
     public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i)))    return false; 
        }
        return true;
     }
    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings ();
        String s = "egg", t = "add";
        System.out.println(solution.isIsomorphic( s, t));  // Output: 3
    }
}
