import java.util.*;
public class The_New_Year_Meeting_Friends{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt(),x2=sc.nextInt(),x3=sc.nextInt(),q=0,w=0,e=0,r=0;
       q=x1-x2;
       w=x2-x3;
       e=x3-x1;
       if(q<0)
       q=-q;
       if(w<0)
       w=-w;
       if(e<0)
       e=-e;
     if(q>w && q>e)
     {
         System.out.print(q);
     }
     if(w>q && w>e){
        System.out.print(w); 
     }
     if(e>q && e>w)
     {
         System.out.print(e);
     }
      
    }
}