package org.example.stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /*插入元素*/
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        /*访问栈顶元素*/
        System.out.println(stack.peek());
        /*元素出栈*/
        stack.pop();
        /*获取栈长*/
        System.out.println(stack.size());
        /*判断栈是否为空*/
        boolean empty = stack.empty();

    }
}
