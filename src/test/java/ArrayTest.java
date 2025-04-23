import org.example.array.Array;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = Array.randomAccess(arr);
        int[] newArray = Array.insertAcrossNewArray(arr, 0, 9);
        Array.printArray(newArray);
        Array.insert(newArray, 5, 4);
        Array.printArray(newArray);
        Array.removeByIndex(newArray, 5);
        Array.printArray(newArray);
        int result = Array.find(newArray, 99);
        newArray = Array.extend(newArray);
        Array.printArray(newArray);
        System.out.println(result);
        System.out.println(arr[i]);
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
