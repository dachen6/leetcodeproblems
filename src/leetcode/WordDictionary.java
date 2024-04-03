package leetcode;

public class WordDictionary {
	WordDictionary[] children;
	boolean isword;
	boolean starts;
	public WordDictionary() {
    	children = new WordDictionary[26];
    	
   	 starts = true;
	}

	public void addWord(String word) {
		WordDictionary curtrie = this;
    	for(int i = 0 ; i < word.length();i++)
    	{
    		char cur = word.charAt(i);
    		int index= cur - 'a';
    		
    		if(curtrie.children[index] == null) {
    			curtrie.children[index] = new WordDictionary();	
    		}
    		curtrie = curtrie.children[index];
    	}
    	curtrie.isword = true;
	}

	public boolean search(String word) {
		WordDictionary curtrie = this;
		return help( word, 0, curtrie);
	}
	
	public boolean help(String word, int index, WordDictionary curtrie) {
		if (index == word.length()) {
			return curtrie.isword;
		}

    		char cur = word.charAt(index);
    		if(cur == '.') {
    		  	for(int j = 0 ; j < 26;j++)
    	    	{
    		  		if(curtrie.children[j] != null) {
    		  			if( help( word, index + 1, curtrie.children[j])) {
    		  				return true;
    		  			}
    	    			
    	    		}
    	    	}
    		}
    		
    		
    		else if(curtrie.children[cur-'a'] == null) {
    			return false;
    			
    		}
    		else {
    			return help( word, index + 1, curtrie.children[cur-'a']);
    		}
    		return false;
	}
	
    public static void main(String[] args)
    {
    	WordDictionary obj = new WordDictionary();
    	obj.addWord("ab");
    	obj.addWord("db");
    	//obj.addWord("dad");
    	//obj.addWord("mad");
    	System.out.println(obj.search(".b"));// return False
    	//System.out.println(obj.search("bad"));     // return True
    	//System.out.println(obj.search(".ad")); // return True
    	//System.out.println(obj.search("b.."));     // return True
    }
	
}
