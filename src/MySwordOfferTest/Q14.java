package MySwordOfferTest;
import SwordOffer.node.*;
/*
 * ����һ����������������е�����k����㡣
 */
public class Q14 {
	 public ListNode FindKthToTail(ListNode head,int k) {
		 if(head==null) return null;
		 ListNode slow=head,fast=head;
        int index=0;
		 while(fast!=null){
              fast=fast.next;
			 if(index>=k){
				 slow=slow.next;
			 }
             index++;
		 }
         if(index<k) return null;
		 else return slow;
		 
	 }
}
