package Leetcode;
import Leetcode.Q19_RemoveNthNode;
public class Q24_SwapNodes {
	 public ListNode swapPairs(ListNode head) {
	        ListNode start=new ListNode(0);
	        start.next=head;
	        if(head==null||head.next==null) return start.next;
	        ListNode slow=start,fast=start;
	        int tmp;
	        while(fast.next!=null)
	        {
	            if(fast.next.next!=null)
	            {
	                fast=fast.next.next;
	                slow=slow.next;
	            }
	            tmp=slow.val;
	            slow.val=fast.val;
	            fast.val=tmp;
	        }
	        return start.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
