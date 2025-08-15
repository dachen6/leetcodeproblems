package leetcode;

public class InsertGreatestCommonDivisorsinLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy  = head;
        while(head.next != null) {
        	int pre = head.val;
        	int end = head.next.val;
        	int mid =gcd(pre, end);
        	ListNode midnode = new ListNode(mid);
        	midnode.next = head.next;
        	head.next = midnode;
        	head = head.next.next;
        	
        }
        return dummy;
    }
    
    public int gcd(int a, int b) {
    	   if (b==0) return a;
    	   return gcd(b,a%b);
    	}
}
