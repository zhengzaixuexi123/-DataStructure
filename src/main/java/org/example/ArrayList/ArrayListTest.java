package org.example.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

import static com.sun.javafx.fxml.expression.Expression.add;

public class ArrayListTest {
    public static void main(String[] args) {
        /*初始化列表*/
        //无初始值 DEFAULT_CAPACITY = 10
        ArrayList<Integer> list = new ArrayList<Integer>();
        //有初始值
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
        //添加元素到列表尾部
        list.add(9);
        list.add(8);
        list.add(7);
        //添加元素到指定位置
        list.add(3,6);
        //添加Collection所有元素到列表尾部
        nums.addAll(list);
        //清空列表
        list.clear();
        /* 用copyOf()浅拷贝，原先是引用型数据类型时，原数组和新数组内部的引用数据类型是共享的；基本数据类型是独立的 */
        ArrayList<Integer> clone = (ArrayList<Integer>) nums.clone();
        //直接遍历列表
        for (Integer i : nums) {
            System.out.print(i);
        }//1234567899876
        System.out.println();
        clone.add(5);
        /*浅拷贝的对象是新new的，不会影响旧数组的遍历*/
        //通过索引打印列表
        int count = 0;
        for (int i = count; i<nums.size(); i++){
            System.out.print(nums.get(i));//同上
        }
        System.out.println();
        //如果列表包含指定元素返回ture
        boolean contains = nums.contains(1);
        System.out.println("contains " + contains);//contains true
        //返回指定索引的元素
        Integer i = nums.get(0);
        System.out.println(i);//1
        //返回第一次出现指定元素的索引
        System.out.println(nums.indexOf(6));//5
        //如果列表内无元素返回空
        System.out.println(list.isEmpty());//true
        //返回最后一次出现该元素的索引
        System.out.println(nums.lastIndexOf(7));//11
        //移除此列表位置上的元素
        nums.remove(0);
        //移除此列表位置上首次出现的元素
        Integer object = 2;
        nums.remove(object);
        //返回包含此列表中索引元素的数组
        //当初值大小大于nums里的值时空余的部分赋值null，小于的时候会扩容漫画
        Integer[] array = nums.toArray(new Integer[0]);
        for (Integer integer : array) {
            System.out.print(integer);
        }//34567899876
        //将nums实际容量调整为当前大小
        nums.trimToSize();
    }
}
