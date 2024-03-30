package leetcode;

public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		gas[0] =gas[0]- cost[0];
		for(int i = 1; i < gas.length; i++) {
			gas[i] =gas[i]- cost[i];
			gas[i] = gas[i-1] + gas[i];
		}
		if(gas[gas.length -1] < 0) {
			return -1;
		}
		int ans = 0;
		int min = gas[0];
		for(int i = 0; i < gas.length; i++) {
			if(gas[i] < min )
			{
				min = gas[i];
				ans = i;
			}
			
		}
		ans +=1;
		if(ans  == gas.length) {
			return 0;
		}
		return ans;
	}

	public static void main(String[] args) {
		GasStation cd = new GasStation();
		int ans = cd.canCompleteCircuit(new int[] {2,0,0,0,0 }, new int[] { 0,1,0,0,0});
		System.out.print(ans);
	}
	
}
