package org.example.stack;

import java.util.Stack;

/*栈的典型用例
 * 1.程序的内存管理:每次调用函数，系统都会在栈顶添加一个栈帧来记录函数的上下文关系
 * 在递归操作中，往下递归都会用到入栈操作，而回溯则不断用到出栈操作
 * 2.浏览器的后退前进，以及撤销与返撤销操作
 * */
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
