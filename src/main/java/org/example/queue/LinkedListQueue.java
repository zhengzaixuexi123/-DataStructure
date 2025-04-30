package org.example.queue;

import org.example.linked_list.ListNode;

public class LinkedListQueue {
    private ListNode front, rear;
    private int queueSize;

    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    public ListNode getFront() {
        return front;
    }

    /*获取队列长度*/
    public int getQueueSize() {
        return queueSize;
    }

    /*判断队列是否为空*/
    public boolean isEmpty() {
        return queueSize == 0;
    }

    /*入队*/
    public void push(int n) {
        ListNode listNode = new ListNode(n);
        if (front == null) {
            front = listNode;
            rear = listNode;
        } else {
            rear.next = listNode;
            rear = listNode;
        }
        queueSize++;
    }

    /*出队*/
    public int pop() {
        int num = peek();
        front = front.next;
        queueSize--;
        return num;
    }

    /*访问队首元素*/
    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return front.getVal();
    }

    /*将链表转化为Array并返回*/
    public int[] toArray() {
        ListNode listnode = front;
        int[] arr = new int[getQueueSize()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = listnode.getVal();
            listnode = listnode.next;
        }
        return arr;
    }

}
