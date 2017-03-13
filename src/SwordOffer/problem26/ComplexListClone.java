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
 * ��ʵ�ֺ�������ʵ�ָ���һ�����ӵ������ڸ��ӵ������У�ÿ���ڵ���һ��nextָ��ָ����һ���ڵ�
 * ����һ��Siblingָ�������е�����ڵ����null
 * 
 */

public class ComplexListClone {

    public ComplexListNode cloneList(ComplexListNode head) {
        copyNode(head);
        processSibling(head);

        return split(head);
    }

    // ��һ�� ���ƽڵ�
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

    // �ڶ��� ����sibling
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

    // ������ ���
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
