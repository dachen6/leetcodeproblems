package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	Set<String> used = new HashSet<String>();
    	Set<String> dic = new HashSet<String>();
    	for(String s : wordList ) {
    		dic.add(s);
    	}
    	if(!dic.contains(beginWord) ||!dic.contains(endWord) ) {
    		return -1;
    	}
    	for(int i = 0; i < beginWord.length();i++) {
    		char cur= 
        	for(int j = 0; j < 26;j++) {
        		
        	}
    	}
    }
}
