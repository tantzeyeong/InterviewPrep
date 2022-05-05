package ArraysAndStrings;

public class StringCompression {

    public static String solve(String s) {
        // Create stringbuilder
        StringBuilder str = new StringBuilder(s.charAt(0));
        // Keep track of letter
        char letter = s.charAt(0);
        // Keep track of count
        int count = 1;
        // If character changes, append letter and count into stringbuilder, reset count and change letter
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != letter) {
                str.append(letter);
                str.append(count);
                count = 1;
                letter = s.charAt(i);
            } else {
                count += 1;
            }
        }
        str.append(letter);
        str.append(count);
        // If stringbuilder length is more or equal to length of s, return s
        if (s.length() <= str.length()) {
            return s;
        }
        // Else return stringbuilder
        else {
            return str.toString();
        }
        // Time Complexity: O(s)
        // Space Complexity: O(s)
    }
}