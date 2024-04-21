

import java.util.*;
public class good_sub_by_devanshu {
    public static void main (String args[]) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        sc.close();
        int result=Count_good_substrings(s);
        System.out.println(result);
    }
    private static int Count_good_substrings(String s){
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int decimal=0;
            for(int j=i;j<n;j++){
                int digit= s.charAt(j)-'0';
                decimal=(decimal*2)+digit;
                int length=j-i+1;
                if(decimal==length){
                    count++;
                }
                if(decimal>length){
                    break;
                }
            }
        }
        return count;
    }
}