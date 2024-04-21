import java.util.*;

public class firstuniquechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean found = false;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.print(-1);
        }
    }
}
