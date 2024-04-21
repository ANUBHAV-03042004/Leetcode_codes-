public class BestTimetoBuyandSellStockII {
    public static void main(String args[])
    {
  int prices[]={7,1,5,3,6,4};
  int res = 0;
  for (int i = 0; i < prices.length - 1; i++) {
    int cP = prices[i];
    int nP = prices[i + 1];
    if (nP > cP) res += nP - cP;
  }
  System.out.print(res);
}
}
  
