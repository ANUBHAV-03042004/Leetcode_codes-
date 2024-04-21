import java.util.*;

class MaximizeHappinessofSelectedChildren {
    public static long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : happiness) {
            pq.add(i);
        }
        long sum = 0;
        int i=0;
        while (k-- > 0 && !pq.isEmpty()) {
            int max = pq.poll();
            if ((max - i) > 0)  sum += (max - i);
            i++;
        }
        return sum;
    }

    public static void main(String args[]) {
        int [] happiness = {12,8,24};
        int  k = 3;
        System.out.print(maximumHappinessSum(happiness, k));
    }
}
