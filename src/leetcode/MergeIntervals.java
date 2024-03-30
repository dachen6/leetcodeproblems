package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
	
	public static class Interval {
		      int start, end;
		      Interval(int start, int end) {
		          this.start = start;
		          this.end = end;
		      }
		  }
	public List<Interval> merge(List<Interval> intervals) {
	      
        Comparator<Interval> comparator = new Comparator<Interval>() {
    @Override
    public int compare(Interval left, Interval right) {
        return left.start - right.start; 
    }
};

        intervals.sort( comparator);
        int i =  0;
    while( i <intervals.size()-1 ){
        if(intervals.get(i + 1).start <intervals.get(i).end){
            int start = intervals.get(i).start;
            int end = intervals.get(i +1).end;
            intervals.add(i, new Interval(start, end));
            intervals.remove(i+1);
            intervals.remove(i+1);
        }
        else{
            i++;
        }
    }
    return intervals;

    }
	
	public static void main(String[] args) {
		Interval one = new Interval(1,4);
		Interval two = new Interval(1,4);
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(one);
		intervals.add(two);
		MergeIntervals cd = new MergeIntervals();
		System.out.print(cd.merge(intervals).toString());
		
	}
}
