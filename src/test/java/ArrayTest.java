import org.example.array.Array;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = Array.randomAccess(arr);//生成随机索引
        System.out.println(arr[i]);
        int[] newArray = Array.insertAcrossNewArray(arr, 0, 9);//在索引9的位置插入0
        Array.printArray(newArray);//打印数组
        Array.insert(newArray, 5, 4);//在索引4插入5
        Array.printArray(newArray);
        Array.removeByIndex(newArray, 5);//删除索引5的元素
        Array.printArray(newArray);
        int result = Array.find(newArray, 99);//查询值为99的元素
        newArray = Array.extend(newArray);//扩容数组
        System.out.println(result);
        Array.printArray(newArray);
    }

    @Test
    public void OneArrayPrint() {
        int[] a = new int[5];//{0,0,0,0,0}
        int[] b = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
    }

}
