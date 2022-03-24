import Graph.Graph;
import LinkedList.MyLinkedList;
import LinkedList.SumLinkedList;

public class MainClass {
    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        mainClass.testGraph();
//        SlidingWindowPattern windowPattern = new SlidingWindowPattern();
//        long result = windowPattern.
//                findMaximum(Arrays.asList(4,3,7,2,5,6,8,11), 5);
//        System.out.println(result);
//
//        Anagram anagram = new Anagram();
//        System.out.println(anagram.TestAnagram("anagram", "nagaram"));
//
//        SumZero sumZero = new SumZero();
//        System.out.println(sumZero.FindIfSumZero(Arrays.asList(-4,2,3,4,6,8,11)));

//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.Add(7);
//        linkedList.Add(1);
//        linkedList.Add(6);
//
//        linkedList.Print();
//
//        System.out.println();
//
//        MyLinkedList linkedList2 = new MyLinkedList();
//        linkedList2.Add(5);
//        linkedList2.Add(9);
//        linkedList2.Add(2);
//
//        linkedList2.Print();
//
//        System.out.println();
//
//        SumLinkedList list = new SumLinkedList();
//        MyLinkedList.Node node = list.SumTwoSameSizeLinkedList(linkedList.getHead(), linkedList2.getHead());
//
//        for (;node != null; ) {
//            System.out.print(node.getValue());
//            node = node.getNext();
//        }


        //        BinarySearchTree bst = new BinarySearchTree();
//        bst.Add(20);
//        bst.Add(15);
//        bst.Add(27);
//        bst.Add(10);
//        bst.Add(35);
//        bst.Add(5);
//        bst.Add(30);
//        bst.Add(1);
//
//        System.out.println(bst.BFS());
//        System.out.println(bst.PreOrder());
//        System.out.println(bst.PostOrder());
//        System.out.println(bst.InOrder());
//
//        MaxBinaryHeap maxBinaryHeap = new MaxBinaryHeap();
//        maxBinaryHeap.Add(10);
//        maxBinaryHeap.Add(78);
//        maxBinaryHeap.Add(20);
//        maxBinaryHeap.Add(37);
//        maxBinaryHeap.Add(28);
//        maxBinaryHeap.Add(21);
//        maxBinaryHeap.Add(1);
//        maxBinaryHeap.Add(5);
//        maxBinaryHeap.Add(99);
//        maxBinaryHeap.Add(106);
//        maxBinaryHeap.Add(123);
//        maxBinaryHeap.Add(1699);
//
//        System.out.println(maxBinaryHeap.getHeap());

    }

    void testGraph() {
        Graph graph = new Graph(5);

//        graph.AddEdge(0, 1);
//        graph.AddEdge(0, 4);
//        graph.AddEdge(1, 2);
//        graph.AddEdge(1, 3);
//        graph.AddEdge(1, 4);
//        graph.AddEdge(2, 3);
//        graph.AddEdge(3, 4);

        graph.AddEdge(0, 1);
        graph.AddEdge(0, 2);
        graph.AddEdge(0, 3);
        graph.AddEdge(1, 2);
        graph.AddEdge(1, 3);
        graph.AddEdge(2, 3);
        graph.AddEdge(2, 1);
        graph.AddEdge(3, 1);
        graph.AddEdge(3, 0);

        graph.BreathFirstSearch(0);
        System.out.println("---------------");
        graph.DepthFirstSearch(0);
    }
}
