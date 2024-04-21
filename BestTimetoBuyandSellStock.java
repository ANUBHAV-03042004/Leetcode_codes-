
public class BestTimetoBuyandSellStock
{
	public static void main(String[] args) {
	    int prices[]={7,1,5,3,6,4};
       int res=0,min=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++)
       {
           if(prices[i]<min) min=prices[i];
           else if(prices[i]-min>res)
            res=prices[i]-min;
       }
  System.out.print(res);
    }
}

