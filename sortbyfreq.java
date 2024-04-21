class sortbyfreq {
    public String frequencySort(String s) {
       int[] freq = new int[128]; // ASCII size
        char[] chars = s.toCharArray();

        for (char c : chars) {
            freq[c]++;
        }
         for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (freq[chars[i]] < freq[chars[j]]) {
                    // Swap characters
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                } else if (freq[chars[i]] == freq[chars[j]] && chars[i] < chars[j]) {
                    // If frequency is same, sort in lexicographical order
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String (chars);
    }
}