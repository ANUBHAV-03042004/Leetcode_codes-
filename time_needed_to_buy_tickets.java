/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class time_needed_to_buy_tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
  int ans = 0;
    for (int i = 0; i < tickets.length; ++i)
      if (i <= k)
        ans +=Math.min(tickets[i], tickets[k]);
      else
        ans += Math.min(tickets[i], tickets[k] - 1);
    return ans;
    }
	public static void main(String[] args) {
	int tickets[]={2,3,2};
	int k=2;
	System.out.print(timeRequiredToBuy(tickets,k));
	}
}
