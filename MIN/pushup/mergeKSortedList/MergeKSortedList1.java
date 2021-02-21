import java.util.ArrayList;
import java.util.List;

public class MergeKSortedList1 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        print(solve(l1,l2,l3));
        // solve(l1,l2,l3);

    }

    public static ListNode solve(ListNode l1, ListNode l2, ListNode l3) {

        List<Integer> list = new ArrayList<>();
        ListNode newHaed = new ListNode(0);

        while(l1!=null) {
            list.add(l1.val);
            l1 = l1.next;
        }

        while(l2!=null) {
            list.add(l2.val);
            l2 = l2.next;
        }

        while(l3!=null) {
            list.add(l3.val);
            l3 = l3.next;
        }

        list.sort((a,b)->a-b);

        //Root node가 존재하고 그 이후에 next를 반복해야 ListNode가 완성 된다.
        ListNode p3 = newHaed;
        for(Integer i : list) {
            p3.next = new ListNode(i);
            p3 = p3.next;
        }

        return newHaed.next;
    }

    public static void print(ListNode result){
        while(result!=null) {
            System.out.println(result.val + "->");
            result = result.next;
        }
    }
}
