package ArraysAndStrings;

import java.util.HashMap;
import java.util.Locale;

public class PalindromePermutation {

    public static boolean solve(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == ' ') {
                continue;
            }
            if (!hashMap.containsKey(character)) {
                hashMap.put(character, 1);
            } else {
                hashMap.replace(character, hashMap.get(character) + 1);
            }
        }
        int odd = 1;
        for (int i : hashMap.values()) {
            if (i % 2 != 0) {
                if (odd == 0) {
                    return false;
                } else {
                    odd -= 1;
                }
            }
        }
        return true;
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
}
