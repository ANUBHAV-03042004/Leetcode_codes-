import java.util.*;

class intersection_of_two_arrays {
    public static void main(String args[]) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        Set<Integer> a = new HashSet<>();
        for (int num : nums1) {
            a.add(num);
        }
    Set<Integer> b = new HashSet<>();
        for (int num : nums2) {
            b.add(num);
        }
        a.retainAll(b);
        int[] ans = new int[a.size()];
       int i=0;
       for(int e:a)
       {
           ans[i++]=e;
       }

             System.out.println(Arrays.toString(ans));
    }
}

