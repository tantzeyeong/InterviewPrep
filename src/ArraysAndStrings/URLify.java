package ArraysAndStrings;

public class URLify {

    public static void solve(char[] characters, int length) {
        // Keep a pointer at the back of the character array
        int backPointer = characters.length - 1;
        // Iterate through the character array starting from the back
        // If there is a character, place it to the back of the array
        // Else if space, minus pointer at the back by 3
        for (int i = length - 1; i >= 0; i--) {
            // If pointer at the back is equals to last character
            if (i == backPointer) {
                return;
            }
            if (!(characters[i] == ' ')) {
                characters[backPointer] = characters[i];
                backPointer -= 1;
            } else {
                characters[backPointer] = '0';
                characters[backPointer - 1] = '2';
                characters[backPointer - 2] = '%';
                backPointer -= 3;
            }
        }
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
}
