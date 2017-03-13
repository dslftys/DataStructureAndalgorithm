package SwordOffer.problem25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import sun.security.util.Length;
import SwordOffer.node.*;
/*
 * ����һ����������һ����������ӡ���������нڵ�ֵ��Ϊ��������������·���������ĸ��ڵ㿪ʼ����һֱ��
 * Ҷ�ڵ��������Ľڵ��γ�һ��·��
 * 
 */
public class FindPath {
	public ArrayList<ArrayList<Integer>> findPath(BTreeNode root, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (null == root) {
            return list;
        }
        Stack<Integer> stack = new Stack<>();
        generate(root, target, stack, list);

        return list;
    }

    private void generate(BTreeNode root, int target, Stack<Integer> stack, ArrayList<ArrayList<Integer>> list) {
        if (null == root) {
            return;
        }
        if (null == root.leftChild && null == root.rightChild) {
            if (root.data == target) {
                ArrayList<Integer> tmpList = new ArrayList<>();
                for (int i : stack) { 
                    tmpList.add(i);
                }
                tmpList.add(root.data);
                list.add(tmpList);
            }
        } else {
            stack.push(root.data);
            generate(root.leftChild, target - root.data, stack, list);
            generate(root.rightChild, target - root.data, stack, list);
            stack.pop();
        }
    }
}
