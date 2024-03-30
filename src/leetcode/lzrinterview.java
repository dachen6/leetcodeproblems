package leetcode;

public class lzrinterview {
	public double finance(double input) {
		double result = 0;
		if(input < 0) {
			return -1.0;
		}
		if(input < 10) {
			result = input * 0.05 + 0.05;
		}
		else if(input >= 10 && input < 2999.99) {
			result = input * 0.029 + 0.3;
		}
		else if(input >= 3000 && input < 9999.99) {
			result = input * 0.025 + 0.3;
		}
		else {
			result = input * 0.022 + 0.3;
		}
		return result;
	}
}
