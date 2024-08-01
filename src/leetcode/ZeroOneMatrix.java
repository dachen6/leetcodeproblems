package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
    	int row=  mat.length;
    	int col = mat[0].length;
    	int[][] check = new int[row][col];
    	Queue<int[]> q = new LinkedList<int[]>(); 
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < col;j++) {
        		if(mat[i][j] == 0) {
        			q.add(new int[] {i,j});
        			check[i][j] = 1;
        		}
        	}
        }
        int dis = 0;
        while(!q.isEmpty()) {
        	dis++;
        	int size = q.size();
        	for(int i = 0 ;i < size;i++) {
        		int[] cur = q.poll();
        		if(cur[0] + 1 < row ||check[cur[0] + 1][cur[1]] ==0) {
        			mat[cur[0] + 1][cur[1]] = dis;
        			check[cur[0] + 1][cur[1]] =1;
        			q.add(new int[] {cur[0] + 1,cur[1]});
        		}
        		if(cur[0] - 1 >= 0 ||check[cur[0] - 1][cur[1]] ==0) {
        			mat[cur[0] - 1][cur[1]] = dis;
        			check[cur[0] - 1][cur[1]] = 1;
        			q.add(new int[] {cur[0] - 1,cur[1]});
        		}
        		if(cur[1] + 1 < col ||check[cur[0]][cur[1] + 1] ==0) {
        			mat[cur[0]][cur[1] + 1] = dis;
        			check[cur[0]][cur[1] + 1] = 1;
        			q.add(new int[] {cur[0],cur[1]+1});
        		}
        		if(cur[1] - 1  >= 0 ||check[cur[0]][cur[1] - 1] ==0) {
        			mat[cur[0]][cur[1] - 1] = dis;
        			check[cur[0]][cur[1] - 1] = 1;
        			q.add(new int[] {cur[0],cur[1]-1});
        		}
        	}
        }
        return mat;
    }
}
