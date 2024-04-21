import java.util.Arrays;

public class h_index {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= citations.length - i) {
                h = citations.length - i;
            } else {
                break;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        h_index solution = new h_index();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution.hIndex(citations));  // Output: 3
    }
}
