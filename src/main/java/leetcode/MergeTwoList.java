package leetcode;

class MergeTwoList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr = null;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while(p1 != null || p2 != null) {
            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;
            ListNode node = null;

            if (p1 != null) {
                x = p1.val;
                if (p2 != null) {
                    y = p2.val;
                }

            } else if ( p2 != null) {
                y = p2.val;
                if (p1 != null) {
                    x = p1.val;
                }
            }

            if (x != Integer.MAX_VALUE && y != Integer.MAX_VALUE) {
                if (x <= y) {
                    node = new ListNode(x);
                    p1 = p1.next;
                } else {
                    node = new ListNode(y);
                    p2 = p2.next;
                }
            } else if (x == Integer.MAX_VALUE && y != Integer.MAX_VALUE) {
                node = new ListNode(y);
                p2 = p2.next;
            } else if (y == Integer.MAX_VALUE && x != Integer.MAX_VALUE) {
                node = new ListNode(x);
                p1 = p1.next;
            }

            if (node != null) {
                if (head == null ) {
                    head = node;
                    curr = head;
                } else {
                    curr.next = node;
                    curr = curr.next;
                }
            }
        }

        return head;
    }

    public static void main(String[] args) {
        MergeTwoList list = new MergeTwoList();
        ListNode one = new ListNode(1);
        one.next = new ListNode(2);
        one.next.next = new ListNode(4);

        ListNode two = new ListNode(1);
        two.next = new ListNode(3);
        two.next.next = new ListNode(4);

        ListNode result = list.mergeTwoLists(one, two);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
