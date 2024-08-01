package leetcode;

public class MinimizeMaximumofArray {
	public int minimizeArrayValue(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int l = nums.length;
		for (int e : nums) {
			max = Math.max(max, e);
			min = Math.min(min, e);
		}

		while (min < max) {

			int curiright = nums[l-1];
			int curileft=  nums[l-2];
			int mid = (min + max) / 2;
			int diff = 0;
			for (int i = l - 1; i >= 1; i--) {
				

				 diff = curiright - mid;
				if (diff > 0) {
					curiright = curileft + diff;
				}
				else {
					curiright = curileft;
				}
				diff = Math.max(0, diff);
				curileft = nums[i-1];
			}
			diff = Math.max(0, diff);
			curileft+= diff;
			if (curileft > mid) {
			
				min = mid+1 ;

			} 
			else {
				max = mid ;
			}
			
			//System.out.println(mid);

		//	System.out.println();
		}
		return min;
	}
	
	  public static void main(String[] args) {
		  MinimizeMaximumofArray cd = new MinimizeMaximumofArray();
		 int ans = cd.minimizeArrayValue(new int[] {3,7,1,6});
		 System.out.print(ans);
	  }
	  //   14 16 16
	  //   18 14 14 
	  //   16 15 15
}
