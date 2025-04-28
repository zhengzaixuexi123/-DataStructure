package org.example.linked_list;

public interface LinkedListRealize {
    void insert(ListNode n0, ListNode P);
    void remove(ListNode n0);
    ListNode access(ListNode head, int index);
    int find(ListNode head, int target);
}
