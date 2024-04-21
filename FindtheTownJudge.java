
public class FindtheTownJudge
{
	public static void main(String[] args) {
	//    int trust[][]={{1,3},{2,3},{3,1}};
	   int trust[][]={{1,3},{2,3}};
	    int n=3;
	    boolean b=false;
       int[] trustCount = new int[n + 1];
        int[] trustedByCount = new int[n + 1];
        for (int[] relation : trust) {
            trustCount[relation[0]]++;
            trustedByCount[relation[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == 0 && trustedByCount[i] == n - 1)
            {
                System.out.print(i);
                b=true;
            }
         
        }
   if(!b) System.out.print(-1);
        
    }
}

