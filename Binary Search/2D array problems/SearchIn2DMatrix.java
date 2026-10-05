class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowSize = matrix.length;
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < rowSize && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}
