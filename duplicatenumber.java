import java.util.*;

public class duplicatenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[] nums = {1, 3, 4, 2, 2};  // replace with your array
Arrays.sort(nums);
int c = 0;
for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == nums[i + 1]) {
        c = nums[i];
        break;
    }
}
System.out.println(c);  

        }
    }

