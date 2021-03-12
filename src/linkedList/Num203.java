package linkedList;

public class Num203 {

  class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode removeElements(ListNode head, int val) {
    ListNode goal = new ListNode(val - 1);
    goal.next = head;
    ListNode prev = goal;
    for (; prev.next != null; ) {
      if (prev.next.val == val) {
        prev.next = prev.next.next;
      } else {
        prev = prev.next;
      }
    }
    return goal.next;
  }
}
