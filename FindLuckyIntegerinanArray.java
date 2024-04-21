import java.util.*;
class FindLuckyIntegerinanArray {
    public static int findLucky(int[] arr) {
        int max=-1;
        int count[]=new int[501];
        for(int i=0;i<arr.length;i++)
{
    count[arr[i]-1]++;
}
for(int i=0;i<arr.length;i++)
{
      if(count[arr[i]-1]==arr[i])max=Math.max(max,arr[i]);
}
return max;
    }
    public static void main(String args[])
    {

        int arr [] = {2,2,2,3,3};
        System.out.print(findLucky(arr));
}
}
