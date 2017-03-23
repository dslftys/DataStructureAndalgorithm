package MySwordOfferTest;
/*
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
/*
 * 1.如果先建立链表进行一一复制，然后再解决random指针，那么就会出现每个节点都要从头遍历一次。那么复杂度为O(n2)
 * 2.如果在原来链表基础上，每个节点复制出来一个副节点(都在偶数位)，前面的sibling与后面的sibling指针指的位置也是前后关系
 * 然后再拆分。奇数为原链表，偶数为复制的链表
 */
import MySwordOfferTest.node.*;
public class Q25 {
    public static RandomListNode Clone(RandomListNode pHead)
    {
    	if(pHead==null) return null;
        //先复制链表，组成N+N'链表如：1——>2——>3——>4复制：1——>2——>2——>3——>3——>4——>4
        CopyListNode(pHead);
        //再分配复制部分的random'
        RandomDeal(pHead);
        //拆分
        return CopyListGet(pHead);
    }
    public static void CopyListNode(RandomListNode pHead){
    	RandomListNode dummy=pHead;
    	while(dummy!=null){
    		RandomListNode node=new RandomListNode(dummy.label);
    		node.next=dummy.next;
    		dummy.next=node;
    		dummy=dummy.next.next;
    	}
    }
    public static void RandomDeal(RandomListNode pHead){
    	RandomListNode dummy=pHead;
    	while(dummy!=null){
    		if(dummy.random!=null)
    			dummy.next.random=dummy.random.next;
    		else dummy.next.random=null;
    		dummy=dummy.next.next;
    	}
    }
    public static RandomListNode CopyListGet(RandomListNode pHead){
    	RandomListNode s=new RandomListNode(0);
    	RandomListNode s1=s;
    	while(pHead!=null){
    		RandomListNode node=pHead.next;
    		pHead=node.next;
    		node.next=s.next;
    		s.next=node;
    		s=s.next;
    	}
    	return s1.next;
    }
    
    public static void main(String[] args) {
    	RandomListNode ran1=new RandomListNode(1);
    	RandomListNode ran2=new RandomListNode(2);
    	RandomListNode ran3=new RandomListNode(3);
    	RandomListNode ran4=new RandomListNode(4);
    	
    	ran1.next=ran2;
    	ran2.next=ran3;
    	ran3.next=ran4;
    	ran1.random=ran3;
    	ran2.random=null;
    	ran3.random=ran2;
    	ran4.random=null;
    	RandomListNode ram=Clone(ran1);
    	while(ram!=null){
    		System.out.println(ram.label);
    		System.out.println(ram.random==null?"null":ram.random.label);
    		ram=ram.next;
    	}
    		
    	
	}
}
