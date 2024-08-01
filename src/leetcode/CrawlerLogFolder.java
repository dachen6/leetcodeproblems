package leetcode;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
    	int level = 0;
        for(String s : logs) {
        	if(s.equals("./")) {
        		
        	}
        	else if(s.equals("../")) {
        		level-=1;
        		level = Math.max(0, level);
        	}
        	else {
        		level++;
        	}
        }
        return level;
    }
    public static void main(String[] args) {
    	CrawlerLogFolder cd = new CrawlerLogFolder();
		  cd.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"});
	  }
}
