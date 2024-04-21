import java.util.*;
public class soft_drink
{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),p=sc.nextInt(),nl=sc.nextInt(),np=sc.nextInt();
       int t_slices=(c*d)/n;//total slices/n=total slices per person
       int t_drink=((l*k)/nl)/n;//(total millilitre of drink/toast ml for 1 person= no.of drink)/n=no.of drink per person
       int t_salt=(p/np)/n;//(total gm of salt/toast gm for 1 person=  no.of salt )/n=total no.of salt per person
     // the least no.of ingredients=max.toasts
     int m=Math.min(Math.min(t_slices,t_drink),t_salt);
     System.out.print(m);

    }
    
}