import utils.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoSortedLists a = new MergeTwoSortedLists();
        ListNode r = a.mergeTwoLists(list1, list2);
        r.show(r);
    }
}