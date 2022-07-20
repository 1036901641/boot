package com.boot.utils;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ：王继创
 * @description : TODO
 * @date : 2022/7/18 11:01
 * @version : 1.0
 */
public class ListNode {
    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public void print(){
        ListNode p = this;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

    /**
     * @describe :
     * @author 王继创
     * @date 15:12 2022/7/19
 * @param head
 * @param x
 * @return com.boot.utils.ListNode
     **/
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p1 = dummy1, p2 = dummy2;
        ListNode p = head;

        while (p != null) {
            if(p.val >= x) {
                p2.next = p;
                p2 = p2.next;
            }else {
                p1.next = p;
                p1 = p1.next;
            }
            ListNode tmp = p.next;
            p.next = null;
            p = tmp;
        }
        p1.next = dummy2.next;
        return dummy1.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        ListNode guard = new ListNode(-1);
        ListNode p = guard;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(
                lists.length, Comparator.comparingInt(a -> a.val));
        for(ListNode head : lists){
            if(head != null){
                priorityQueue.add(head);
            }
        }
        while(!priorityQueue.isEmpty()){
            ListNode node = priorityQueue.poll();
            p.next = node;
            if(node.next != null){
                priorityQueue.add(node.next);
            }
            p = p.next;
        }
        return guard.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,3,6};
        ListNode head = new ListNode(1);
        ListNode p = head;
        for(int i : nums){
            p.next = new ListNode(i);
            p = p.next;
        }
        head.partition(head,4);
        head.print();
    }
}
