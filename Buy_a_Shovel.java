import java.util.Scanner;

public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); 
        int r = scanner.nextInt(); 
        int s;
        for (s = 1; s < 10; s++) { 
          
            if ((k * s) % 10 == r || (k * s) % 10 == 0) { 
              
                break; 
            }
        }
        System.out.println(s);
    }
}
