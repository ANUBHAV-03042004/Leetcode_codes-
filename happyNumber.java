import java.util.*;
class happyNumber{
public static void main(String args[]){
    int n=1111111,s=happy(n);
    boolean t=false;
    
    do{
        s=happy(s);
    }
    while(s>=10);
    if(s==1) t=true;
 System.out.print(t);
}
    public static int happy(int n){
int s=0;
while(n>=1)
{
    s+=Math.pow(n%10,2);
    n/=10;
}
return s;
    }
}
