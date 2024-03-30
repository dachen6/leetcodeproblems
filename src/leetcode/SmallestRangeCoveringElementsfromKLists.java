package leetcode;

import java.util.*;
import java.util.PriorityQueue;

public class SmallestRangeCoveringElementsfromKLists {
	public int[] smallestRange(List<List<Integer>> nums) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> nums.get(a[0]).get(a[1]) - nums.get(b[0]).get(b[1]));
		int min =   nums.get(0).get(0); int max =  nums.get(0).get(0);
		int glomin; int glomax;
		for(int i = 0; i < nums.size();i++) {
			
			pq.add(new int[] {i,0});
			max = Math.max(max, nums.get(i).get(0));
			min = Math.min(min, nums.get(i).get(0));
		}
		glomin = min;
		glomax = max;
		while (pq.peek()[1]  +1  < nums.get(pq.peek()[0]).size()) {
			int[] cur = pq.poll();
			pq.add(new int[] {cur[0], cur[1] +1});
			int[] move = pq.peek();
			min = nums.get(move[0]).get(move[1]);
			max =  Math.max(max, nums.get(cur[0]).get(cur[1] + 1));
			 System.out.println(min + "   " + max);
			if(max - min < glomax - glomin) {
				glomin = min;
				glomax= max;
			}
		}
		 System.out.println(glomin + "   " + glomax);
		return new int[] {glomin, glomax};
		
	}

	
	public static void main(String[] args) {
		SmallestRangeCoveringElementsfromKLists cd = new SmallestRangeCoveringElementsfromKLists();
		Integer[][] arrs = {{4,20},{4,10,15},{0,10,12},{7,18}};
		List<List<Integer>> nums = new ArrayList<>();
		for(Integer[] arr : arrs) {
			nums.add(Arrays.asList(arr));
		}
		cd.smallestRange(nums);
	}
}
