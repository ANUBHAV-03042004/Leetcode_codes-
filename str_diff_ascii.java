import java.util.*;

public class str_diff_ascii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = s.length(), c = 0, i = 0;
        while (q > i) {
            for (int j = i + 1; j < q; j++) {
                c = (int) (s.charAt(j) - s.charAt(i));
                System.out.print(s.charAt(i) + "" + c);
                i++;
            }
            System.out.print(s.charAt(i));
            i++;
        }
        sc.close();
    }
}
