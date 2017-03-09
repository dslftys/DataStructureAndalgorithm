package Leetcode;

public class Q203_RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }
}

/*  我的
public ListNode removeElements(ListNode head, int val) {
ListNode newHead=new ListNode(0);
newHead.next=head;
ListNode fast=newHead.next,slow=newHead;

while(fast!=null){
    if(fast.val==val){//中间
        if(fast.next!=null){
            slow.next=fast.next;
            fast=slow.next;
        }else{
            slow.next=null;
            fast=fast.next;
            //fast=null;
        }
    }else{
        slow=slow.next;
        fast=fast.next;
    }
}
return newHead.next;
}
*/