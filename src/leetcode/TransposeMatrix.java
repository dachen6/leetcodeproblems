package leetcode;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int len = matrix[0].length;
        
        int[][] res = new int[len][row];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < row; j++) {
            	res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}
