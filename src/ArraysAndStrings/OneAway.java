package ArraysAndStrings;

import static java.lang.Math.min;

public class OneAway {

    public static boolean solve(String s1, String s2) {
        // Create a variable for the shorter string
        // Create a variable for the longer string
        String shorterString, longerString;
        if (s1.length() > s2.length()) {
            shorterString = s2;
            longerString = s1;
        } else {
            shorterString = s1;
            longerString = s2;
        }

        int count = 0;
        // If string lengths are the same, means only need to replace
        // If more than 1 replacements needed, return false, else true
        if (shorterString.length() == longerString.length()) {
            for (int i = 0; i < longerString.length(); i++) {
                if (shorterString.charAt(i) != longerString.charAt(i)) {
                    count += 1;
                }
                if (count >= 2) {
                    return false;
                }
            }
        }
        // Else, means string lengths not the same and have to insert a new character
        // to the shorter string
        // If more than 1 character needs to be added, return false, else true
        else if (longerString.length() - shorterString.length() > 1) {
            return false;
        } else {
            int longerIndex = 0;
            for (int i = 0; i < shorterString.length(); i++) {
                if (shorterString.charAt(i) != longerString.charAt(longerIndex)) {
                    count += 1;
                    i--;
                }
                if (count > 1) {
                    return false;
                }
                longerIndex++;
            }
        }
        return true;
    }
    // Time Complexity: O(max(s1, s2))
    // Space Complexity: O(1)
}
