import org.example.linked_list.LinkedList;
import org.example.linked_list.LinkedListRealize;
import org.example.linked_list.ListNode;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void test(){
        ListNode n0 = new ListNode(0);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        LinkedListRealize linkedList = new LinkedList();
        linkedList.remove(n3);
        linkedList.access(n0,2);

        linkedList.insert(n3,n4);
    }


}
