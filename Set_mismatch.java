import java.util.*;

class Set_mismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int d = 0, m = 0, c[] = new int[nums.length + 1];
        for (int i : nums) {
            c[i]++;
        }
        for (int j = 1; j <= nums.length; j++) {
            if (c[j] == 0)
                m = j;
            else if (c[j] == 2)
                d = j;
        }
        return new int[] {d, m};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Set_mismatch solution = new Set_mismatch();
        int[] result = solution.findErrorNums(nums);
        System.out.println("Duplicate and missing numbers are: " + Arrays.toString(result));
    }
}
