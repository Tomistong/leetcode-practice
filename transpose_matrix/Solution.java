class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        
        int result[][] = new int[column][row];
        
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
}