import java.util.ArrayList;
import java.util.Collections;

class KthLargest {
    private ArrayList<Integer> pq = new ArrayList<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        for (int i : nums) {
            pq.add(i);
        }
        this.k = k;
    }

    public int add(int val) {
        pq.add(val);
        Collections.sort(pq);
        return pq.get(pq.size() - k);
    }

    public static void main(String[] args) {
        // Example usage
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));  // Output: 4
        System.out.println(kthLargest.add(5));  // Output: 5
        System.out.println(kthLargest.add(10)); // Output: 5
        System.out.println(kthLargest.add(9));  // Output: 8
        System.out.println(kthLargest.add(4));  // Output: 8
    }
}
