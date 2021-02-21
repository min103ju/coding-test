import java.util.PriorityQueue;

public class MergeKSortedList2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[3];
        list[0]=l1;
        list[1]=l2;
        list[2]=l3;

        print(solve(list));
    }

    public static ListNode solve(ListNode[] list) {

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode newHead = new ListNode(0);
        ListNode p=newHead;
        for(ListNode node : list){
            while(node!=null){
                queue.offer(node);
                node=node.next;
            }
        }

        while(!queue.isEmpty()){
            p.next=queue.poll();
            p=p.next;
        }

        return newHead.next;
    }

    public static void print(ListNode result){
        while(result!=null) {
            System.out.println(result.val + "->");
            result = result.next;
        }
    }
}
