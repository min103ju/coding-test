public class ReverseLinkedLists2 {
    
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        printNode(l1);
        ListNode head=solve(l1);
        printNode(head);
    }

    public static ListNode solve(ListNode cur){
        ListNode prev=null;
        ListNode next=null;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        return prev;
    }   

    public static void printNode(ListNode node) {
        while(node!=null) {
            System.out.println(node.val);
            node=node.next;
        }
        System.out.println();
    }
}
