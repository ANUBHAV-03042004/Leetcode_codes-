import java.util.*;

class reverse_integer {
    public int reverse(int x) {
        int q = x;
        long r = 0;
        while (q != 0) {
            r = r * 10 + q % 10;
            q = q / 10;
            if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int x = scanner.nextInt();
       reverse_integer solution = new reverse_integer();
        int result = solution.reverse(x);
        System.out.println("The reversed integer is: " + result);
    }
}
