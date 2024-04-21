public class Jump_Game{
    public static void main(String args[]){
     int[] nums= {2,3,1,1,4};
        int maxReach = 0;
        boolean t=true;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach)   t= false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
     System.out.print(t);
    }
}
