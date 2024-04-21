/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class intTOroman {
    public static String intToRoman(int num) {
          String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};
        
    //     return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10]; 
    StringBuilder ans = new StringBuilder();

ans.append(ths[num / 1000]);
ans.append(hrns[(num % 1000) / 100]);
ans.append(tens[(num % 100) / 10]);
ans.append(ones[num % 10]);
return ans.toString();
    }

    public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman(num));
    }
}

