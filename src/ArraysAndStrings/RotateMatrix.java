package ArraysAndStrings;

public class RotateMatrix {

    public static boolean solve(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }
        int left = 0;
        int right = matrix.length - 1;

        while (left < right) {
            int top = left;
            int bottom = right;
            for (int i = left; i < right; i++) {
                int temp = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = temp;
            }
            left += 1;
            right -= 1;
        }

        // Printing matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return true;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
}
