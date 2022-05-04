package ArraysAndStrings;

public class CheckPermutation {

    public static boolean solve(String s1, String s2) {
        // Return false if both lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }
        // Create array of size 256
        int[] array = new int[256];
        int character;
        // Add 1 to each character slot based on the number of each characters in s1
        for (int i = 0; i < s1.length(); i++) {
            character = (int) s1.charAt(i);
            array[character] += 1;
        }
        // Loop through s2 and -1 to each character count when encountering each letter
        for (int i = 0; i < s2.length(); i++) {
            // If the count at a particular character slot is already zero, return false
            character = (int) s2.charAt(i);
            if (array[character] == 0) {
                return false;
            }
            array[character] -= 1;
        }
        // Return true if done looping through s2
        return true;
    }

    // Time complexity: O(s1 + s2)
    // Space complexity: O(1)
}
