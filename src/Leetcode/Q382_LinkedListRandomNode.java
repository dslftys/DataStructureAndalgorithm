package Leetcode;

import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

/*
Given a singly linked list, return a random node's value from the linked list. 
Each node must have the same probability of being chosen.
Follow up:
What if the linked list is extremely large and its length is unknown to you? Could
 you solve this efficiently without using extra space?
Example:
// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have
equal probability of returning.
solution.getRandom();
 */

/*
   Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q382_LinkedListRandomNode {

	public static int list2(int length){
		return  (int)(Math.random()*length+1);
	}
	
	public static int randInt(int min,int max){
		Random random=new Random();
		return min+random.nextInt((max-min)+1);
	}
	public static void main(String[] args) {
		//for(int i=0;i<1000;i++)
		System.out.println(list2(10));
			System.out.println(randInt(1,10));
		
	}
    
}

/*
 * Random
     int length=0;
        ListNode cur=head;
        while(cur.next!=null){
            length++;
            cur=cur.next;
        }
        Random=(int)(Math.random()*length+1);
        cur=head.next;
        while(Random!=1&&cur.next!=null){
            cur=cur.next;
            Random--;
        }
        return cur.val;
 */


/*
 * public int getRandom() {
        ListNode curNode=head;
        int r=curNode.val;
        for(int i=1;curNode.next!=null;i++){
            curNode=curNode.next;
            if(randInt(0,i)==i) r=curNode.val;
        }
        return r;
    }
    private int randInt(int min,int max){
        return min+(int)(Math.random()*((max-min)+1))
    }
 */















