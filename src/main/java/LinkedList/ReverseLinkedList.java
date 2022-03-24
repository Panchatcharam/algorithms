package LinkedList;

public class MyLinkedList {

    private Node head;

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertNode(int data) {
        if (head == null) {
            head = new Node(data);
            head.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data);
        }
    }

    // 1 -> 3 -> 6 -> 9 -> 12 -> 15
    //1
    //3
    //6
    //9
    //12
    //15
    public Node recurseReverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node res = recurseReverse(node.next);
        node.next.next = node;
        node.next = null;
        return res;
    }

    // 1 -> 3 -> 6 -> 9 -> 12 -> 15
    // null <- 1 3 -> 6 -> 9 -> 12 -> 15
    public void reverseLinkedList(Node node) {
        Node prev = null;
        Node curr = node;
        Node temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
    }

    public static void main(String [] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertNode(1);
        list.insertNode(3);
        list.insertNode(6);
        list.insertNode(9);
        list.insertNode(12);
        list.insertNode(15);
        list.printList();
        list.head = list.recurseReverse(list.head);
//        list.reverseLinkedList(list.head);
        list.printList();
    }
}
