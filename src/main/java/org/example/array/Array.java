package org.example.array;

import java.util.concurrent.ThreadLocalRandom;

public class Array {
    /*访问随机数*/
    public static int randomAccess(int[] arr) {
        return ThreadLocalRandom.current().nextInt(0, arr.length);
    }

    /*插入元素(返回插入的新数组)*/
    public static int[] insertAcrossNewArray(int[] arr, int val, int index) {
        int[] newArr = new int[arr.length + 1];
        if (index >= 0) System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = val;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        return newArr;
    }

    /*插入元素*/
    public static void insert(int[] arr, int val, int index) {
        for (int i = arr.length - 1; i > index; i--) {//把index之后的所有元素向后移动
            arr[i] = arr[i - 1];
        }
        arr[index] = val;
    }

    /*通过索引删除元素*/
    public static void removeByIndex(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    /*遍历元素*/
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /*查找元素*/
    public static int find(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    /*扩容数组*/
    public static int[] extend(int[] arr){
        int[] arr1 = new int[arr.length * 2];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        return arr1;
    }
}
