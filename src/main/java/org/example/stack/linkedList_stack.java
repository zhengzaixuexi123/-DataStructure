package org.example.stack;

import org.example.linked_list.ListNode;

public class linkedList_stack {
    private ListNode stackPeek;
    private int stkSize;

    public linkedList_stack(){
        stackPeek = null;
    }

    /*获取栈的长度*/
    public int size(){
        return stkSize;
    }
    /*判断栈是否为空*/
    public boolean isEmpty(){
        return size() == 0;
    }
    /*入栈*/
    public void push(int num){
        ListNode newNode = new ListNode(num);
        newNode.next = stackPeek;//把栈顶赋值给新节点的下一个节点
        stackPeek = newNode;//把栈顶指针指向新节点
        stkSize++;
    }
    /*出栈*/
    public int pop(){
        int num = peek();
        stackPeek = stackPeek.next;//把栈顶指针指向下一个节点
        stkSize--;
        return num;
    }
    /*访问栈顶元素*/
    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return stackPeek.getVal();
    }
    /*将List转化为Array并返回*/
    public int[] toArray(){
        ListNode node = stackPeek;
        int[] res = new int[size()];
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = node.getVal();
            node = node.next;
        }
        return res;
    }
}
