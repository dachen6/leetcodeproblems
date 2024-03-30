package leetcode;

public class SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int ans = 0;
		int pro = 1;
		int slow = 0;

		for (int i = 0; i < nums.length; i++) {
			pro *= nums[i];
		
			while (slow <= i) {
				if (pro < k) {
					break;
				}
				pro /= nums[slow];
				slow++;
			}
			int t = i -slow  +1;
			System.out.println(nums[i]  + "  jiale" + t );
			ans +=i -slow +1 ;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		SubarrayProductLessThanK cd = new SubarrayProductLessThanK();
		cd.numSubarrayProductLessThanK(new int[] { 57,44,92,28,66,60,37,33,52,38,29,76,8,75,22}, 18);
	}
}
