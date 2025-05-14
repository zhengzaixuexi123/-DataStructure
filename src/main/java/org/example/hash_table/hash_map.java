package org.example.hash_table;

import java.util.HashMap;
import java.util.Map;

public class hash_map {
    public static void main(String[] args) {
        //默认构造
        //默认DEFAULT_INITIAL_CAPACITY == 1<<4，1左移4位即16（默认初始大小16，出现hash冲突的时候以2倍扩容，最大64）
        //默认负载因子（哈希表的元素数量除以筒的个数）DEFAULT_LOAD_FACTOR = 0.75f;
        //默认MIN_TREEIFY_CAPACITY = 64;
        //默认TREEIFY_THRESHOLD = 8;
        //UNTREEIFY_THRESHOLD = 6;
        /*当哈希筒的单链表在插入后的长度大于等于8，且hashmap最大容量为64时，会转化链表为红黑树，注意数组最大容量不是64
         * 当哈希桶的红黑树只有6个元素的话，会转为链表*/

        HashMap<Integer, String> hashMap = new HashMap<>();
        //添加元素
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");
        hashMap.put(7, "seven");
        //获取键值为5的value
        String name = hashMap.get(5);
        //删除键为2的键值对
        hashMap.remove(2);
        /*遍历hash表*/
        //1.遍历key和value
        for (Map.Entry<Integer, String> kv : hashMap.entrySet()) {
            System.out.println(kv.getKey() + " " + kv.getValue());
        }
        //2.只遍历key
        for (Integer key : hashMap.keySet()) {
            System.out.println(key);
        }
        //3.只遍历value
        /*可以迭代key使用hashmap.get(key)的形式获取val值，
        但直接遍历value少一次get方法的调用
        */
        for (String val : hashMap.values()) {
            System.out.println(val);
        }
    }
}
