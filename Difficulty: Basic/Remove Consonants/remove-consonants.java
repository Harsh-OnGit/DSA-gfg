class Solution {
    String remConsonants(String s) {
        // code here
        String result = "";

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        result += ch;
                    }
                }

                return result;
    }
};