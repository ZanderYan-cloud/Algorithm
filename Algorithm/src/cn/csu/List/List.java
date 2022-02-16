package cn.csu.List;

/**
 * @package:cn.csu.ListNode
 * @ClassName: ListNodeNode
 * @Description: Definition for singly-linked ListNode.
 * @Author: ZanderYan
 * @Date: 2022-02-16 10:57
 */


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class List {


    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            if (node.val == val) {
                if (node == head) {
                    head = head.next;
                    node.next = null;
                    node = head;
                    continue;
                } else {
                    prev.next = node.next;
                    node.next = null;
                    /*prev = prev.next;*/
                    if (prev != null) {
                        node = prev.next;
                    } else {
                        node = null;
                    }
                    continue;
                }
            }
            prev = node;
            node = node.next;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode tail = head;
        /*tail = addListNode(tail, 2);
        tail = addListNode(tail, 6);
        tail = addListNode(tail, 3);
        tail = addListNode(tail, 4);
        tail = addListNode(tail, 5);
        tail = addListNode(tail, 6);
        printList(head);
        head = removeElements(head, 6);
        printList(head);*/

        head = new ListNode(1, null);
        tail = head;
        tail = addListNode(tail, 2);
        tail = addListNode(tail, 2);
        tail = addListNode(tail, 1);
        printList(head);

        head = removeElements(head, 2);
        printList(head);
    }


    public static ListNode addListNode(ListNode tail, int val) {
        ListNode node = new ListNode(val, null);
        if (tail == null) {
            return node;
        }
        tail.next = node;
        return node;
    }

    public static void printList(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
        System.out.println();
    }


}