package Leetcode;

import util.SingleLinkedList.ListNode;

public class Q206_ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
		 ListNode newnode=null;
		 while(head!=null){
			 ListNode next=head.next;
			 head.next=newnode;
			 newnode=head;
			 head=next;
		 }
		 return head;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*recursive solution 
public ListNode reverseList(ListNode head) {
	return reverseListInt(head, null);
}

private ListNode reverseListInt(ListNode head, ListNode newHead) {
if (head == null)
    return newHead;
ListNode next = head.next;
head.next = newHead;
 return reverseListInt(next, head);
	*/