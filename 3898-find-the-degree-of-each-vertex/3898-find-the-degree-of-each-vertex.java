class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix.length; col++){
                arr[row] += matrix[row][col];
            }
        }
        return arr;
    }
}