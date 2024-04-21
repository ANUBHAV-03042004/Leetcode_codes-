import java.util.Scanner;

public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int c = scanner.nextInt(); 
        int d = scanner.nextInt(); 
      int max1=Math.max(a,b);
      int max2=Math.max(c,d);
     int max3=Math.max(max1,max2);
    
    if(max3!=a)
    {
     System.out.print(max3-a+" ");
    } 
    if(max3!=b)
    {
        System.out.print(max3-b+" ");
    }
    if(max3!=c)
    {
        System.out.print(max3-c+" ");
    }
    if(max3!=d)
    {
        System.out.print(max3-d+" ");
    }
    }
}
