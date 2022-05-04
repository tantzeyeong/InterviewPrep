package ArraysAndStrings;

import java.util.HashMap;

public class IsUnique {

    public static boolean solve(String s) {
        // Create hashmap
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // Check if character already in hashmap
        for (int i = 0; i < s.length(); i++) {
            // Add into hashmap if not already in
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), 0);
                // Return false if already in
            } else {
                return false;
            }
        }
        // Return true when all characters are added
        return true;
    }

    // Time Complexity: O(L), L = length of string
    // Space Complexity: O(1)
}
