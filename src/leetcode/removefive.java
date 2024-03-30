package leetcode;

public class removefive {
	public int remove (int input) {
		
		int len = String.valueOf(input).length();
		
		int[] arr = new int[len+1];
		int tens = 10;
		for(int i = len-1 ; i >= 0; i--) {
			arr[i] = input % tens;
			tens *=10;
		}
		 tens = 1;
		int result = Integer.MIN_VALUE;
		for(int i = len-1 ; i >= 0; i--) {
			
			if(Math.abs((arr[i] - arr[i+1]) )/ tens == 5) {
				int cur =(input-arr[i]) /10 + arr[i+1];
				result = Math.max(result, cur);
			}
			tens *=10;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		removefive cd  = new removefive();
		System.out.print(cd.remove(-55911));
	}
}
