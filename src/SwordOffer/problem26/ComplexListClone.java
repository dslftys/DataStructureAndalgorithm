package SwordOffer.problem26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import sun.security.util.Length;
import SwordOffer.node.*;
/*
 * 请实现函数，来实现复制一个复杂的链表。在复杂的链表中，每个节点有一个next指针指向下一个节点
 * 还有一个Sibling指向链表中的任意节点或者null
 * 
 */

public class ComplexListClone {

    public ComplexListNode cloneList(ComplexListNode head) {
        copyNode(head);
        processSibling(head);

        return split(head);
    }

    // 第一步 复制节点
    private void copyNode(ComplexListNode head) {
        ComplexListNode p = head;
        while (null != p) {
            ComplexListNode clonedNode = new ComplexListNode();
            clonedNode.data = p.data;
            clonedNode.next = p.next;
            clonedNode.sibling = null;
            p.next = clonedNode;
            p = clonedNode.next;
        }
    }

    // 第二步 处理sibling
    private void processSibling(ComplexListNode head) {
        ComplexListNode p = head;
        while (null != p) {
            ComplexListNode clonedNode = p.next;
            if (null != p.sibling) {
                clonedNode.sibling = p.sibling.next;
            }
            p = clonedNode.next;
        }
    }

    // 第三步 拆分
    private ComplexListNode split(ComplexListNode head) {
        ComplexListNode p = head;
        ComplexListNode cloneHead = null;
        ComplexListNode pClone = null;
        if (null != p) {
            pClone = cloneHead = p.next;
            p.next = pClone.next;
            p = p.next;
        }
        while (null != p) {
            pClone.next = p.next;
            pClone = pClone.next;
            p.next = pClone.next;
            p = p.next;
        }
        return cloneHead;
    }

}
