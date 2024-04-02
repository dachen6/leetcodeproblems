package leetcode;

public class Trie {
	Trie[] children;
	boolean isword;
	boolean starts;
    public Trie() {
    	children = new Trie[26];
    	
    	 starts = true;
    }
    
    public void insert(String word) {
    	Trie curtrie = this;
    	for(int i = 0 ; i < word.length();i++)
    	{
    		char cur = word.charAt(i);
    		int index= cur - 'a';
    		
    		if(curtrie.children[index] == null) {
    			curtrie.children[index] = new Trie();
    			
    		}
    		curtrie = curtrie.children[index];
    	}
    	curtrie.isword = true;
    }
    
    public boolean search(String word) {
    	Trie curtrie = this;
    	for(int i = 0 ; i < word.length();i++)
    	{
    		char cur = word.charAt(i);
    		int index= cur - 'a';
    		
    		if(curtrie.children[index] == null) {
    			return false;
    			
    		}
    		else {
    			curtrie = curtrie.children[index];
    		}
    		
    	}
    	return curtrie.isword;
    }
    
    public boolean startsWith(String prefix) {
    	Trie curtrie = this;
    	for(int i = 0 ; i < prefix.length();i++)
    	{
    		char cur = prefix.charAt(i);
    		int index= cur - 'a';
    		
    		if(curtrie.children[index] == null) {
    			return false;
    			
    		}
    		curtrie = curtrie.children[index];
    	}
    	return true;
    }
    
    public static void main(String[] args)
    {
    	Trie obj = new Trie();
    	obj.insert("apple");
    	System.out.println(obj.search("apple"));
    	   // return True
    	System.out.println(obj.search("app"));     // return False
    	System.out.println(obj.startsWith("app")); // return True
    	obj.insert("app");
    	System.out.println(obj.search("app"));     // return True
    }
}
