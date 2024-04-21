import java.util.*;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int sum = 0;
                for (int i = 1; i <= n / 2; i++) {
                    System.out.print(i * 2 + " ");
                    sum += i * 2;
                }
                for (int i = 1; i < n / 2; i++) {
                    System.out.print(i * 2 - 1 + " ");
                    sum -= (i * 2 - 1);
                }
                System.out.println(sum);
            }
        }
    }
}
