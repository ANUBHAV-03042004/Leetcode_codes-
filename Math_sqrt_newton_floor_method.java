import java.util.*;
public class Math_sqrt_newton_floor_method {
    public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double ep=0.0001;
double guess=n/2.0;
while(Math.abs(guess*guess-n)>ep)
{
    guess=(guess+(n/guess))/2.0;
}
int q=(int)guess;

if((guess-q)>0.0001)
{
    int w=(int)Math.floor(guess);
    System.out.println(w);
}
else{
    System.out.println(q);
}

    }
}