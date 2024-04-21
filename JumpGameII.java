public class JumpGameII {
    public static void main(String args[]){
  int [] nums={2,3,1,1,4};
        if (nums.length < 2) System.out.print(0);
        int maxPos = nums[0];
        int maxSteps = nums[0];
        int jumps = 1;
        for (int i = 1; i < nums.length; i++) {
            if (maxSteps < i) {
                jumps++;
                maxSteps = maxPos;
            }
            maxPos = Math.max(maxPos, nums[i] + i);
        }
       System.out.print(jumps);
    }
}
