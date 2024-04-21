public class Make_the_String_Great {
    public static void main(String[] args) {
        String s = "leEeetcode";
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i < sb.length() - 1) {
            if (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32) {
                sb.delete(i, i + 2);
                i = Math.max(0, i - 1); // Go back one character to check for new pairs
            } else {
                i++;
            }
        }
        System.out.print(sb.toString());
    }
}
