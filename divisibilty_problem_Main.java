import java.util.Scanner;

public class divisibilty_problem_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int moves = a[i] % b[i] == 0 ? 0 : b[i] - (a[i] % b[i]);
            System.out.println(moves);
        }
        scanner.close();
    }
}
