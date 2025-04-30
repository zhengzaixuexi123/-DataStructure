package org.example.dequeue;

import java.util.Deque;
import java.util.LinkedList;

/*适用于兼备湛河队列的逻辑
*撤销操作：在撤销操作中，我们用push操作来操作，用pop操作来撤销
* 考虑到资源有限问题，我们一般会给栈设立一个最大操作限度50，然而，
* 超出的部分就应该从栈底出栈，这时用双向队列可以完美解决这个问题*/
public class dequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>();
        //添加至队尾
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        //添加至队首
        deque.addFirst(1);
        //默认添加到队尾
        deque.add(9);
        //访问队首元素
        deque.peekFirst();
        //访问队尾元素
        deque.peekLast();
        //首元素出队
        deque.pollFirst();
        //默认出队首
        deque.poll();
        //尾元素出队
        deque.pollLast();
        //获取双向队列长度
        int size = deque.size();
        //判断双向队列是否为空
        boolean empty = deque.isEmpty();
    }
}
