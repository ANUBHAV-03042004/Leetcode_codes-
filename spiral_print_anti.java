import java.util.*;
public class spiral_print_anti {
    static void spiralPrint(int [][]arr, int r, int c){
        int tr=0, br = r-1, lc =0, rc = c-1;
        int total=0;
        while(total<r*c){
            for(int i=tr; i<=br && total<r*c; i++){
                System.out.print(arr[i][lc]+", ");
                total++;
            }
            lc++;
            for(int i=lc; i<=rc && total<r*c; i++){
                System.out.print(arr[br][i]+", ");
                total++;
            }
            br--;
            for(int i= br; i>=tr && total<r*c; i--){
                System.out.print(arr[i][rc]+", ");
                total++;
            }
            rc--;
            for(int i=rc ; i>=lc && total<r*c; i--){
                System.out.print(arr[tr][i]+", ");
                total++;
            }
            tr++;
        }
    }
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
        spiralPrint(arr,r,c);
        System.out.print("END");

    }
}