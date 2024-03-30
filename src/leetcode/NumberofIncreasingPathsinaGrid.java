package leetcode;

public class NumberofIncreasingPathsinaGrid {
	  int countPaths(int[][] grid) {
	        int ROWS = grid.length, COLS = grid[0].length;
	        int[][] path = new int[ROWS][COLS];
	        int[] step = new int[1];
	        for (int i = 0; i < ROWS; i++) {
	            for (int j = 0; j < COLS; j++) {
	                if (path[i][j] == 0) {              
	                    dfs(grid, ROWS, COLS, i, j, -1, step, path);
	                }
	            }
	        }
	        int res = 0;
	        for (int i = 0; i < ROWS; i++) {
	            for (int j = 0; j < COLS; j++) {
	                System.out.print(path[i][j] + " ");
	                res += path[i][j];
	            }
	            System.out.println();
	        }
	        return res;
	    }

	    int dfs(int[][] grid, int ROWS, int COLS, int r, int c, int pre, int[] step, int[][] path) {
	        if (r < 0 || r == ROWS || c < 0 || c == COLS || grid[r][c] <= pre) {
	            return 0;
	        }
	        if (path[r][c] != 0 ) {
	            return path[r][c];
	        }
	        int res = 1;
	        res += dfs(grid, ROWS, COLS, r + 1, c, grid[r][c], step, path);
	        res += dfs(grid, ROWS, COLS, r - 1, c, grid[r][c], step, path);
	        res += dfs(grid, ROWS, COLS, r, c + 1, grid[r][c], step, path);
	        res += dfs(grid, ROWS, COLS, r, c - 1, grid[r][c], step, path);
	        path[r][c] = res;
	        return res;
	    }

	    public static void main(String[] args) {
	    	NumberofIncreasingPathsinaGrid lzr = new NumberofIncreasingPathsinaGrid();
	        int[][] grid = { { 1, 1 }, { 3, 4 } };
	        int res = lzr.countPaths(grid);
	        System.out.print(res);
	    }
}
