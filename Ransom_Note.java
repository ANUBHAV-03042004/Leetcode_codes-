import java.util.Arrays;

public class Ransom_Note {
   public boolean canConstruct(String ransomNote, String magazine) {
        boolean ans=false;
        for(char i:ransomNote.toCharArray())
        {
       if(magazine.contains(Character.toString(i))) {
                magazine = magazine.replaceFirst(Character.toString(i), "");
                ans=true;
            } else {
                return ans=false;
            }
        }
        return ans;
   }
    public static void main(String[] args) {
        Ransom_Note  solution = new Ransom_Note ();
        String ransomNote = "a", magazine = "b";
        System.out.println(solution.canConstruct(ransomNote,magazine));  // Output: 3
    }
}
