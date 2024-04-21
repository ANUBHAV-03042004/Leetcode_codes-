class RomantoInteger {
    public  static int romanToInt(String s) {
        int ans=0;
       for(int i=0;i<s.length();i++)
       {
        int n1=val(s.charAt(i));
        if((i+1)<s.length()){
        int n2=val(s.charAt(i+1));
        if(n1>=n2) ans+=n1;
        else 
        {
            ans+=n2-n1; 
            i++;
            }
        }
        else ans+=n1;
       }
      return ans; 
      
    }
    public static int val(char ch)
    {
       if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
     return -1;
    }
    public static void main(String args[])
    {
        String s="LXXCII";
        System.out.print(romanToInt(s));
        
    }
}

