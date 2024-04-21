
public class ContiguousArray
{
    public static int findMaxLength(int[] nums) {
        int N = nums.length;//0,1,1,0,1,1,1,0
        int[] a = new int[2*N+2];//18
        int c = N;//8
        int r = 0;
        for(int i = 0; i < N; i++) {// 0 1 2 3 4 5 6 7
            c += nums[i] == 0 ? -1 : 1;//10
            if(c == N) {
                r = i+1;// 4
            }
            else if(a[c] == 0) { //a7 a9 a10 a11
                a[c] = i+1;// 1 3 6 7
            }
            else {
                r = Math.max(r, i - a[c]+1);
            }
        }
        return r;
    }
	public static void main(String[] args) {
	   int [] nums={0,1,1,0,1,1,1,0};
	   System.out.print(findMaxLength(nums));
	}
}
