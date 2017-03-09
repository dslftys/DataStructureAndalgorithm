package Leetcode;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val=x;
	}
}
public class Q19_RemoveNthNode {
	public ListNode removeNthFromEnd(ListNode head,int n)
	{
		 ListNode start=new ListNode(0);
	        ListNode slow=start,fast=start;
	        slow.next=head;
	        int i=1;
	        while(fast!=null)
	        {
	            i++;
	            fast=fast.next;
	            if(i>=n+2) slow=slow.next;
	        }
	        
	        slow.next=slow.next.next;
	        return start.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
