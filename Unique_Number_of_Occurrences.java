import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);//1 1 1 2 2 3
        int[] count = new int[arr.length];
        int uniqueNums = 0;

        for (int i = 0; i < arr.length; ) {
            int j = i;//0
            while (j < arr.length && arr[i] == arr[j]) {
                j++;
            }
            count[uniqueNums++] = j - i;
            i = j;
        }

        Arrays.sort(count, 0, uniqueNums);
        for (int i = 1; i < uniqueNums; i++) {
            if (count[i] == count[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
public class Unique_Number_of_Occurrences{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1,2,2,1,1,3};
        int[] arr2 = {1,2};
        int[] arr3 = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(solution.uniqueOccurrences(arr1)); // should print true
        System.out.println(solution.uniqueOccurrences(arr2)); // should print false
        System.out.println(solution.uniqueOccurrences(arr3)); // should print true
    }
}
