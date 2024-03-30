package leetcode;

public class NthDigit {
	public int findNthDigit(int n) {
	     int tens = 10, count = 0, digits = 1;
	        while ((tens - 1 - tens / 10 + 1) * digits < n) {
	            count += (tens - 1 - tens / 10 + 1) * digits;
	            tens *= 10;
	            digits++;
	        }
	        int mid =0;
	        int left = tens / 10;
	        int right = tens - 1;
	        while (left < right) {
	            mid = left + (right - left) / 2;
	            if ((mid - left + 1) * digits + count > n) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        System.out.print((mid - left + 1) * digits + count - n);
	        return 1;
    }
	public int curdigit(int target, int n) {
		int tens = 1;
		int count = 0;
		int poss = 0;
		int curlong = 1;
		while(target > tens *10) {
			count += (target - tens + 1) * curlong;
			curlong++;
			if(count <= n) {
				poss = target / tens; 
			}
			tens *=10;
			
		}
		System.out.println(count);
		if(n < count - curlong+1) {
			return -1;
		}
		else if(n > count) {
			return -2;
		}
		else {
			return poss;
		}
	}
	
	public static void main(String[] args) {
		NthDigit cd = new NthDigit();
		System.out.print(cd.findNthDigit(11));
		
	
	}
}
