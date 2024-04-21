
public class isUgly
{
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] d = {2, 3, 5};
        for (int i : d) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }
	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}
}
