package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> queue = new LinkedList<Integer>();
        queue.add(deck[deck.length-1]);
        for(int i = deck.length-2; i >= 0;i--) {
        	queue.addFirst(queue.pollLast());
        	queue.addFirst(deck[i]);
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
    	RevealCardsInIncreasingOrder cd = new RevealCardsInIncreasingOrder();
    	cd.deckRevealedIncreasing(new int[] {17,13,11,2,3,5,7});
    }
}
