package utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void show(ListNode head){
        ListNode curr = head;
        while (curr != null){
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }
    }
}
