package MySwordOfferTest;

import SwordOffer.node.ListNode;

/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Q16 {
	 public ListNode Merge(ListNode list1,ListNode list2) {
		 if(list1==null) return list2;
		 if(list2==null) return list1;
		 ListNode dummy=null;
		 if(list1.val<list2.val){
			 dummy=list1;
			 dummy.next=Merge(list1.next, list2);
		 }else{
			 dummy=list2;
			 dummy.next=Merge(list1, list2.next);
		 }
		 return dummy;
		 
	 }
	 
	 public ListNode Merge2(ListNode list1,ListNode list2) {
		 if(list1==null) return list2;
		 if(list2==null) return list1;
	      ListNode L1=new ListNode(0);  
	      ListNode dummy;
	      if(list1.val<=list2.val)
	      {
	    	  dummy=list2;
	    	  L1.next=Merge(list1.next,list2);
	      }
	      else
	    	  L1.next=Merge(list1,list2.next);
	      return L1;
	 }
}
