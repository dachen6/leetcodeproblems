package leetcode;

public class nextpermutation {
	public String[] longest(String[] input)
	{
		int character = 0;
		int num = 0;
		int charstart = -1;
		int numstart = -1;
		for(int i = 0; i < input.length; i++) {
			char cur = input[i].charAt(0) ;
			if(cur >='a' &&  cur <='z' ) {
				character++;
				if(charstart != -1) {
					charstart = i;
				}
			}
			if(cur >='0' &&  cur <='9' ) {
				num++;
				if(numstart != -1) {
					numstart = i;
				}
			}
		}
		int diff = 
		
	}
}
