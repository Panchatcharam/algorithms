package LinkedList;

public class MyLinkedList {

    public static class Node {
        private Node next;
        private int value;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public void Add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(value);
        }
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }
}
