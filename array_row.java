import java.util.*;
public class array_row {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(arr[i][j]+", ");
                }
            }
            else{
                for(int j=c-1;j>-1;j--)
                {
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
    
        System.out.print("END");
    }
}
