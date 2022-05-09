package ArraysAndStrings;

import java.util.HashSet;

public class ZeroMatrix {

    public static void solve(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // Keep track of a set of row values
        HashSet<Integer> row = new HashSet<>();
        // Keep track of a set of column values
        HashSet<Integer> col = new HashSet<>();
        // Iterate through the matrix and add the row and column values of any 0s encountered
        // into the respective row and column sets
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        // At the end of the iteration, iterate through the row and column sets and
        // set the respective rows and columns to 0
        for (Integer r : row) {
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
        }
        for (Integer c : col) {
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
        // Printing matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    // Time Complexity: O(MN)
    // Space Complexity: O(M + N)

    // Can use only O(1) space by using the first row and first column as indicators of zero
    // instead of creating new sets.
    // Whenever possible, try to use original data structure to store information if it's going to be re-written anyway.
}
