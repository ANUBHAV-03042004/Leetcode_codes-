import java.util.*;
public class pairs_of_target_and_difference{
    public static void main(String args[])
    {
       int target=7;
       int arr[]={1,4,5,3,2,6};
      int diff=Integer.MAX_VALUE;
      	System.out.println(diff);
      int a=0;
      int b=0;
       for (int i=0;i<arr.length;i++)
       {
           for (int j=i+1;j<arr.length;j++)
           {
               if(arr[i]+arr[j]==target)
               {
               if(Math.abs(arr[i]-arr[j])<diff)
               {
                   a=arr[i];
                   b=arr[j];
                   diff=Math.abs(arr[i]-arr[j]);
               }
             
               
			System.out.println(arr[i]+","+arr[j]);

               }
           }
       }
       	System.out.println(a+","+b);
       	
    }
    
}