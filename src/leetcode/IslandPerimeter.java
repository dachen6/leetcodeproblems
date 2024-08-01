package leetcode;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
    	int col = grid.length;
    	int row = grid[0].length;
    	int totalland= 0;
    	int connecteg = 0;
        for(int i = 0; i < col;i++) {
        	for(int j = 0; j < row;j++) {
        		if(grid[i][j] == 1) {
        			totalland++;
        			if(i + 1 < col &&grid[i+1][j] == 1 ) {
        				connecteg++;
        			}
        			if(i - 1 > 0 &&grid[i-1][j] == 1 ) {
        				connecteg++;
        			}
        			if(j + 1 < row &&grid[i][j+1] == 1 ) {
        				connecteg++;
        			}
        			if(j - 1 > 0 &&grid[i][j-1] == 1 ) {
        				connecteg++;
        			}
        		}
        	}
        }
        return 4 * totalland - connecteg/2;
    }
}
