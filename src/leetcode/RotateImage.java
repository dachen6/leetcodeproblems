package leetcode;

public class RotateImage {
    public void rotate(int[][] matrix) {
     int n = matrix.length;
     int[][] ans = new int[n][n];
     int count = 0;
     for(int i = n-1; n >= 0;i++) {
         for(int j = n-1; n >= 0;j++) {
        	 ans[count/n][count%n]= matrix[i][j];
        	 count++;
         }
     }
     return ans;
    }
}
