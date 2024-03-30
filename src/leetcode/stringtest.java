package leetcode;

public class stringtest {
	public boolean test() {
		String a = "a";
		String b = new String(a);
		return a == b;
	}
	public static void main(String[] args) {
		stringtest cd =  new stringtest();
		System.out.print(cd.test());
		
	}
}
