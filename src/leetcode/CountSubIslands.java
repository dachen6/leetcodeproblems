package leetcode;

import java.util.*;

public class CountSubIslands {

	class cell {
		int i;
		int j;

		public cell(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}

	public int countSubIslands(int[][] grid1, int[][] grid2) {
		int row = grid1.length;
		int col = grid1[0].length;
		boolean[][] visited = new boolean[row][col];
		int result = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (visited[i][j] != true && grid2[i][j] == 1) {
					result += helper(grid1, grid2, visited, i, j);
				}
			}
		}
		return result;
	}

	public int helper(int[][] grid1, int[][] grid2, boolean[][] visited, int i, int j) {
		visited[i][j] = true;
		Deque<cell> queue = new LinkedList<cell>();
		queue.addFirst(new cell(i, j));
		boolean isSub = true;
		int size = queue.size();
		int[][] move = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		while (queue.size() != 0) {
			for (int x = 0; x < size; x++) {
				cell cur = queue.pollLast();

				if (grid1[cur.i][cur.j] == 0) {
					isSub = false;
				}

				for (int y = 0; y < 4; y++) {
					int curi = cur.i + move[y][0];
					int curj = cur.j + move[y][1];

					if (curi < 0 || curi >= grid1.length || curj < 0 || curj >= grid1.length || grid2[curi][curj] == 0
							|| visited[curi][curj] == true) {
						continue;
					}
					queue.addFirst(new cell(curi, curj));
					visited[curi][curj] = true;
				}
			}

			size = queue.size();
		}
		return isSub ? 1 : 0;
	}

	public static void main(String[] args) {
		CountSubIslands cd = new CountSubIslands();
		int res = cd.countSubIslands(
				new int[][] { { 1, 1, 1, 0, 0 }, { 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 },
						{ 1, 1, 0, 1, 1 } },
				new int[][] { { 1, 1, 1, 0, 0 }, { 0, 0, 1, 1, 1 }, { 0, 1, 0, 0, 0 }, { 1, 0, 1, 1, 0 },
						{ 0, 1, 0, 1, 0 } });
		System.out.print(res);
	}
}
