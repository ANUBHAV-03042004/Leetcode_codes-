import java.util.*;
class ProductofArrayExceptSelf {
public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    output[0] = 1;
    for (int i = 1; i < n; i++) {
        output[i] = output[i - 1] * nums[i - 1];// 1  1 2 6 
    }
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) { 
        output[i] *= rightProduct;
        rightProduct *= nums[i];
    }
    return output;
}
    public static void main(String args[])
    {
        int nums[]={1,2,3,4};
        System.out.print(Arrays.toString(productExceptSelf(nums)));
        
    }
}

