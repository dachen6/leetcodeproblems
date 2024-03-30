package leetcode;

public class ReverseLinkedListII {
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 public ListNode reverseBetween(ListNode head, int left, int right) {
	        ListNode dummy = new ListNode(0);
	        head =dummy;
	        ListNode dummy3 = head;
	         ListNode dummy4 = head;
	        ListNode dummy2 = null;
	        ListNode prev = null;
	        for(int i = 0; i < left; i++){
	        	dummy3 = dummy;    
	            dummy4= dummy.next;
	            dummy = dummy.next;
	        }
	        dummy = dummy4;
	        for(int i = 0; i <= right - left; i++){
	            dummy2 = head.next;
	            System.out.println(dummy2.val);
	            head.next = prev;
	            System.out.println(head.val  );
	            prev = head;
	            System.out.println(prev.val);
	            head = dummy2;
	     
	            System.out.println(head.val);
	        }
	        dummy3.next = prev;
	        dummy4.next = dummy2;
	        return head;
	    }
	 
	 public static void main(String[] args) {
		 ReverseLinkedListII cd = new ReverseLinkedListII();
		 ListNode head = new ListNode(1);
		 ListNode head2 = new ListNode(2);
		 ListNode head3 = new ListNode(3);
		 ListNode head4 = new ListNode(4);
		 ListNode head5 = new ListNode(5);
		 head.next = head2;
		 head2.next = head3;
		 head3.next = head4;
		 head4.next = head5;
		 cd.reverseBetween(head, 1, 2);
	 }
}
