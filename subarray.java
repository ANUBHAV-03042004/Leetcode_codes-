import java.util.*;
public class subarray{
    
    private static int kadens(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
          s+=arr[i];
          max=Math.max(s,max);
        }
       
        return max;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,-4,5,6};
        System.out.println(kadens(arr));
       /* int max=Integer.MIN_VALUE;
        ArrayList <Integer> o=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int s=0;
                for(int k=i;k<=j;k++)
                {
                System.out.print(arr[k]+" ");
                 s+=arr[k];
                 if(s>max)
                 {
                     o.add(arr[k]);
                     max=s;
                 }
                }
                 System.out.println("= "+s);
            }
        }
        for(int q:o)
        {
            System.out.print(q+" ");
        }
        System.out.println();
           System.out.println(max);*/
    }
    
}