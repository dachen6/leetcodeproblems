package leetcode;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
    	int total = row * col;
    	int left = 0;
    	int right = total -1;
    	while(left <= right) {
    		int mid = (left + right) /2;
    		int midrow = mid / col;
    		int midcol = mid % col;
    		if(matrix[midrow][midcol] == target) {
    			return true;
    		}
    		else if (matrix[midrow][midcol] < target) {
    			left = mid  +1;
    		}
    		else {
    			right = mid - 1;
    		}
    	}
    	return false;
    }
}
