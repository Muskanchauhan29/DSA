class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}







// Solution Approaches for Rotating a Matrix 90° Clockwise

// Brute Force (Using Extra Matrix)

// Idea: Create a new matrix and place each element of the original matrix in its rotated position.

// Steps: rotated[j][n-1-i] = matrix[i][j]

// Time Complexity: O(n²) – visit every element once

// Space Complexity: O(n²) – extra matrix used

// Optimal (In-Place: Transpose + Reverse)

// Idea: Rotate without extra space by modifying the original matrix.

// Steps:

// Transpose the matrix (swap matrix[i][j] with matrix[j][i])

// Reverse each row

// Time Complexity: O(n²) – transpose O(n²), reverse O(n²)

// Space Complexity: O(1) – in-place, no extra matrix
