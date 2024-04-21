import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int[] ans = new int[temperatures.length];
        int hottest = 0;
        for (int currDay = temperatures.length - 1; currDay >= 0; currDay--) {
            int currTemp = temperatures[currDay];
            if (currTemp >= hottest) {
                hottest = currTemp;
                continue;
            }
            int nextDay = 1;
            while (temperatures[currDay + nextDay] <= currTemp) {
                nextDay += ans[currDay + nextDay];
            }
            ans[currDay] = nextDay;
        }
        return ans;
    }
}
public class Daily_Temperatures{
    public static void main(String args[])
    {
        int []ar={73,74,75,71,69,72,76,73};
        Solution st=new Solution();

      System.out.println(Arrays.toString(st.dailyTemperatures(ar)));
    
    }
}