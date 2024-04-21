class valid_palin {
    public static void main(String args[]){
  String   s = "race a car";
        s=s.toLowerCase();
       // s=s.replaceAll("\\s","");
        s= s.replaceAll("[^a-z0-9//s]",""); 
        char j='\0';
        boolean t=true;
        int k=0;
        for(char i :s.toCharArray()) 
        {
            j=s.charAt(s.length()-1-k);
    if(i!=j)
    {
        t=false;
        break;
    }
    else k++;
        }
        System.out.print(t);
    }
}