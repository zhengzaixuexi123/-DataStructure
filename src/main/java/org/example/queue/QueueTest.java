package org.example.queue;


import java.util.LinkedList;
import java.util.Queue;

/*队列的典型用例
 * 1.淘宝订单，满足先进先出
 * 2.各类待办事项，如餐厅出餐等
 * */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //元素入队
        queue.offer(1);//队首
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        //访问队首元素
        System.out.println(queue.peek());
        //元素出队
        int pop = queue.poll();
        for (Integer i : queue) {
            System.out.println(i);
        }
        //获取元素长度
        int size = queue.size();
        //判断队列是否为空
        boolean empty = queue.isEmpty();

    }
}
