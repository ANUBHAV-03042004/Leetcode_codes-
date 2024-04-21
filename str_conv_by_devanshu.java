
import java.util.*;
public class str_conv_by_devanshu {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=isunitdistanceapart(s1,s2);
        if(result==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
    public static boolean isunitdistanceapart(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();

        if(Math.abs(len1-len2)>1){
            return false;
        }
        int edits=0;
        int i=0,j=0;
        while(i<len1&&j<len2){
            if(s1.charAt(i) != s2.charAt(j)){
                if(edits==1){
                    return false;
                }
                if(len1<len2){
                    j++;
                }
                else if(len1>len2){
                    i++;
                }
                else{
                    i++;
                    j++;
                }
                edits++;
            }
            else{
                i++;
                j++;
            }
        }
        if(i<len1||j<len2){
            edits++;
        }
        return edits==1;
    }
}