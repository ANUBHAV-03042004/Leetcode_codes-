import java.util.*;
public class bubble_sort_and_selection_sort_and_insertion_sort{
    public static void insertionsort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
         int  j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
          System.out.print(Arrays.toString(arr));
    }
    
    public static void bubblesort(int arr[])
    {
        for(int k=0;k<arr.length;k++)
        {
            boolean f=false;
        for(int j=0;j<arr.length-1-k;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                f=true;
               //  boolean function to check whether the array is sorted or not through bubble sort.
            }
        }   
        System.out.println(Arrays.toString(arr));

        if(f==false)
        {
            break;
        }
        {
            
        }
        }
            System.out.print(Arrays.toString(arr));
    }
    public static void selectionsort(int arr[])
    {
       
           for(int k=0;k<arr.length;k++)
        {
            int key=k;
        for(int j=k+1;j<arr.length;j++)
        {
            if(arr[j]<arr[key])
            {
                key=j;
            }
        }
           int temp=arr[k];
                arr[k]=arr[key];
                arr[key]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String [] args){
        // sorting algos
        //bubble sorting
        // selection sorting
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        
    }
    bubblesort(arr);
    selectionsort(arr);
    insertionsort(arr);
    }
}