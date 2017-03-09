package Leetcode;

import java.util.Stack;

/*
Write a program to find the node at which the intersection of two singly linked lists begins.
For example, the following two linked lists:
A:          a1 ¡ú a2
                   ¨K
                     c1 ¡ú c2 ¡ú c3
                   ¨J            
B:     b1 ¡ú b2 ¡ú b3
begin to intersect at node c1.
Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class Q160_IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		    if(headA==null||headB==null) return null;
	        ListNode dummyA=headA,dummyB=headB;
            int lenA=getLength(dummyA);
            int lenB=getLength(headB);
            
            while(lenA<lenB){
            	dummyA=dummyA.next;
            	lenA--;
            }
            while(lenA>lenB){
            	dummyA=dummyA.next;
            	lenA--;
            }
            while(dummyA!=dummyB){
            	dummyA=dummyA.next;
            	dummyB=dummyB.next;
            }
            return dummyA;
    }
	
	public static  int getLength(ListNode head){
		int i=0;
		while(head!=null){
			i++;
			head=head.next;
		}
		return i;
	}
}
