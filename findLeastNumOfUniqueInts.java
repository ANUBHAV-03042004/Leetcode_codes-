import java.util.*;

public class findLeastNumOfUniqueInts {
    public static void main(String[] args) {
        int[] arr1 = {5, 5, 4};
        int k1 = 1;
        System.out.println(findLeastNumOfUniqueInts(arr1, k1));  // Output: 1

        int[] arr2 = {4, 3, 1, 1, 3, 3, 2};
        int k2 = 3;
        System.out.println(findLeastNumOfUniqueInts(arr2, k2));  // Output: 2
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));
        heap.addAll(count.keySet());
        while (k > 0) {
            k -= count.get(heap.poll());
        }
        return k < 0 ? heap.size() + 1 : heap.size();
    }
}
