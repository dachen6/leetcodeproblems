package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SnakesandLadders {
	public int snakesAndLadders(int[][] board) {
		int row = board.length;
		int col = board[0].length;
		int[][] visit = new int[row][col];
		Queue<Integer> nodes = new LinkedList<Integer>();
		int ans = -1;
		nodes.add(1);
		visit[row - 1][0] = 1;
		while (!nodes.isEmpty()) {
			int size = nodes.size();
			ans++;

			System.out.print(ans + "   ");
			for (int s : nodes) {
				System.out.print(s + "   ");
			}

			System.out.println("   ");

			for (int j = 0; j < size; j++) {

				int curnode = nodes.poll();

				if (curnode == row * row) {
					return ans;
				}
				for (int i = 1; i <= 6 && curnode + i <= row * row; i++) {
					int cur = curnode + i;

					int[] loc = findloc(cur, row);
					if (board[loc[0]][loc[1]] != -1) {
						cur = board[loc[0]][loc[1]];
						loc = findloc(cur, row);
					}

					if (visit[loc[0]][loc[1]] != 1) {
						visit[loc[0]][loc[1]] = 1;
						nodes.add(cur);
					}
				}
			}

		}
		return -1;
	}

	public int[] findloc(int cur, int row) {
		int[] res = new int[2];
		int curnoderow = (cur - 1) / row;
		curnoderow = row - curnoderow - 1;
		int curnodecol = (cur - 1) % row;
		if ((row - 1 - curnoderow) % 2 == 1) {
			curnodecol = row - curnodecol - 1;
		}
		res[0] = curnoderow;
		res[1] = curnodecol;
		return res;
	}

	public static void main(String[] args) {
		SnakesandLadders cd = new SnakesandLadders();
		// int ans = cd.snakesAndLadders(new int[][] {{-1,-1},{-1,3}});
		// int ans = cd.snakesAndLadders(new int[][] {{1,1,-1},{1,1,1},{-1,1,1}});
		int ans = cd.snakesAndLadders(
				new int[][] { { -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1 }, { -1, -1, -1, -1, -1, -1 },
						{ -1, 35, -1, -1, 13, -1 }, { -1, -1, -1, -1, -1, -1 }, { -1, 15, -1, -1, -1, -1 } });
		System.out.print(ans);

	}
}
