import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> br = new ArrayList<>();
        char[] c1, c2;
        if (strs.length == 0) return new ArrayList<>();
        for (String s : strs) {
            c1 = s.toCharArray();
            Arrays.sort(c1);
            boolean t = false;
            for (List<String> ar : br) {
                c2 = ar.get(0).toCharArray();
                Arrays.sort(c2);
                if (Arrays.equals(c1, c2)) {
                    ar.add(s);
                    t = true;
                    break;
                }
            }
            if (!t) {
                List<String> cr = new ArrayList<>();
                cr.add(s);
                br.add(cr);
            }
        }
        return br;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}
