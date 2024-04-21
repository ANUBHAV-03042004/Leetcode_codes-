class Valid_Parentheses {
    public static void main(String args[]){
        String s="()[]{[}]";
            while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
            else {
System.out.print(s.isEmpty());
break;
            }
            }
        
    }
}