package LinkedList;

public class SumLinkedList {
    public MyLinkedList.Node SumTwoSameSizeLinkedList(MyLinkedList.Node list1, MyLinkedList.Node list2) {
        return AddSameSizeList(list1, list2, 0);
    }

    private MyLinkedList.Node AddSameSizeList(MyLinkedList.Node list1, MyLinkedList.Node list2, int carry) {
        if (list1 == null && list2 == null && carry == 0) {
            return null;
        }

        MyLinkedList.Node result = new MyLinkedList.Node(0);
        int value = carry;

        if (list1 != null) {
            value += list1.getValue();
        }

        if (list2 != null) {
            value += list2.getValue();
        }

        result.setValue(value % 10);

        if (list1 != null || list2 != null) {
            MyLinkedList.Node more = AddSameSizeList(list1 == null ? null : list1.getNext(),
                    list2 == null ? null : list2.getNext(),
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }

        return result;
    }
}
