package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        int[][] check  = new int[row][col];
        for(int i = 0 ;i < row; i++) {
        	for(int j = 0 ; j < col;j++) {
        		if(check[i][j] == 0 && grid[i][j] == '1') {
        			check[i][j] = 1;
        			helper(grid, check, i, j,row, col);
        			ans++;
        		}
        	}
        }
        return ans;
    }
    
    public void helper(char[][] grid, int[][] check,int row, int col, int rowsize, int colsize) {
    	Queue<int[]> queue = new LinkedList<int[]>();
    	queue.offer(new int[] {row, col});
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		for(int i = 0; i < size;i++) {
    			int[] cur = queue.poll();
    			if(cur[0] - 1 >=0 &&check[cur[0] - 1][cur[1]] == 0 && grid[cur[0] - 1][cur[1]] == '1'  ) {
    				queue.offer(new int[] {cur[0] - 1, cur[1]});
    				check[cur[0] - 1][cur[1]] =1 ;
    			}
    			if(cur[0] + 1 <= rowsize &&check[cur[0] + 1][cur[1]] == 0 && grid[cur[0] + 1][cur[1]] == '1'  ) {
    				queue.offer(new int[] {cur[0] + 1, cur[1]});
    				check[cur[0] + 1][cur[1]] =1 ;
    			}
    			if(cur[1] - 1 >=0 &&check[cur[0] ][cur[1] -1] == 0 && grid[cur[0]][cur[1]-1] == '1'  ) {
    				queue.offer(new int[] {cur[0], cur[1]-1});
    				check[cur[0]][cur[1]-1] =1 ;
    			}
    			if(cur[1]+ 1 <= colsize &&check[cur[0]][cur[1]+1] == 0 && grid[cur[0]][cur[1] +1] == '1'  ) {
    				queue.offer(new int[] {cur[0] - 1, cur[1]});
    				check[cur[0]][cur[1]+1] =1 ;
    			}
    		}
    		
    	}
    	return;
    }
    
    
    public static void main(String[] args) {
    	NumberofIslands cd = new NumberofIslands();
    	cd.numIslands(new int[][] {{}{}{}{}})
    }
}
