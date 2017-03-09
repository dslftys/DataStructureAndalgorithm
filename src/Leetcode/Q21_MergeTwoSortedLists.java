package Leetcode;

import util.SingleLinkedList.ListNode;
import util.SingleLinkedList.Node;
/*
	  Object element; // ˝æ›”Ú
	  public Node next;  //÷∏’Î”Ú
	  public Node(Node nextval) {
	      this.next = nextval;
	  }
 */

public class Q21_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		if(l2==null) return l1;
		ListNode mergehead=null;
		
		if(l1.val<l2.val){
			mergehead=l1;
			mergehead.next=mergeTwoLists(l1.next, l2);
		}else{
			mergehead=l2;
			mergehead.next=mergeTwoLists(l1, l2.next);
		}
		return mergehead;
	}
    public static void main(String[] args) {
		
	}
}