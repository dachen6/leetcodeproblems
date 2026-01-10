package leetcode;

public class FindtheMinimumAreatoCoverAllOnesI {
    public int minimumArea(int[][] grid) {
        int left = grid[0].length;
        int right = 0;
        int top = grid.length;
        int down = 0;
        
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
            	if(grid[i][j] == 1) {
            		left = Math.min(left, i);
            		right = Math.max(right, i);
            		top = Math.min(top, j);
            		down = Math.max(down, j);
            	}
            }
        }
        
        return (right - left + 1) * (down - top + 1);
    }
}
