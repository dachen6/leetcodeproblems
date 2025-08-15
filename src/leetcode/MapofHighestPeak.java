package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MapofHighestPeak {

	
    public int[][] highestPeak(int[][] isWater) {
    	Queue<int[]> queue = new LinkedList<>();
    	int row = isWater.length;
    	int col = isWater[0].length;
    	int[][] checked = new int[row][col];

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				isWater[i][j] = 1- isWater[i][j] ;
				if(isWater[i][j] == 0) {
					checked[i][j] =1;
					queue.add(new int[] {i,j});
				}
			}
		}
		int high = 0;
		while(queue.size()!= 0) {
			int size = queue.size();
			high++;
			for(int i = 0 ; i < size; i++) {
				
				int[] cur = queue.poll();
				if(cur[0] -1 >=0 &&checked[cur[0] -1][cur[1]]== 0) {
					isWater[cur[0] -1][cur[1]] = high;
					queue.add(new int[] {cur[0] -1,cur[1]});
					checked[cur[0] -1][cur[1]]= 1;
				}
				if(cur[0] +1 < row &&checked[cur[0] +1][cur[1]]== 0) {
					isWater[cur[0] +1][cur[1]] = high;
					queue.add(new int[] {cur[0] +1,cur[1]});
					checked[cur[0] +1][cur[1]]= 1;
				}
				if(cur[1] -1 >=0 &&checked[cur[0]][cur[1]-1]== 0) {
					isWater[cur[0]][cur[1] -1] = high;
					queue.add(new int[] {cur[0] ,cur[1]-1});
					checked[cur[0]][cur[1]-1]= 1;
				}
				if(cur[1] +1 < col &&checked[cur[0] ][cur[1]+1]== 0) {
					isWater[cur[0]][cur[1] +1] = high;
					queue.add(new int[] {cur[0],cur[1]+1});
					checked[cur[0]][cur[1]+1]= 1;
				}
			}
		}
		return isWater;
    }
}
