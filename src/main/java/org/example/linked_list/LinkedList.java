package org.example.linked_list;

public class LinkedList implements LinkedListRealize {
    @Override
    /*在链表节点n0后加一个p节点*/
    public void insert(ListNode n0, ListNode P){
        P.next = n0.next;
        n0.next = P;
    }
    @Override
    /* 删除链表的节点 n0 之后的首个节点 */
    public void remove(ListNode n0){
        if(n0.next == null){
            return;
        }
        ListNode n1 = n0.next;
        n0.next = n1.next;
    }

    @Override
    /* 访问链表中索引为 index 的节点 */
    public ListNode access(ListNode head, int index) {
        for (int i = 0; i < index; i++) {
            if(head.next == null){
                return null;
            }
            head = head.next;
        }
        return head;
    }

    @Override
    /* 在链表中查找值为 target 的首个节点 */
    public int find(ListNode head, int target) {
        int index = 0;
        for(;head != null;head = head.next){
            if (head.val == target){
                return index;
            }
            index++;
        }
        return -1;
    }


}
