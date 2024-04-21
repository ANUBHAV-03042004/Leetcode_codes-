import java.util.Scanner;

public class FastestElevator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int fETime = Math.abs(a - 1);
            int sETime = Math.abs(b - c) + Math.abs(c - 1);

            if (fETime < sETime) {
                System.out.println(1); // First elevator is faster
            } else if (fETime > sETime) {
                System.out.println(2); // Second elevator is faster
            } else {
                System.out.println(3); // Both elevators arrive at the same time
            }
        }

        sc.close();
    }
}
