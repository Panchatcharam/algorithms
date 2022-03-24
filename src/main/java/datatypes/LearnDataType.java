package datatypes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LearnDataType {

    public enum TEST{
        HELLO,
        PANCH
    }

    public static void main(String [] args) {
        List<Integer> myList = List.of(4,5,6,7,1,1,1,1,1,2,3);

        // EnumSet
        Set<TEST> enumSet = EnumSet.allOf(TEST.class);
        Consumer<TEST> print = System.out::println;
        enumSet.forEach(print);

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>(myList);
        hashSet.forEach(System.out::print);
        System.out.println();

        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>(myList);
        linkedHashSet.forEach(System.out::print);
        System.out.println();

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>(myList);
        treeSet.add(10);
        treeSet.forEach(System.out::print);
        System.out.println();

        // ArrayList
        List<Integer> arrayList = new ArrayList<>(myList);
        arrayList.forEach(System.out::print);
        System.out.println();

        // LinkedList
        List<Integer> linkedList = new LinkedList<>(myList);
        linkedList.forEach(System.out::print);
        System.out.println();

        // LinkedList
        List<Integer> vector = new Vector<>(myList);
        Comparator<Integer> comparator = Comparator.naturalOrder();
        vector.stream().sorted(comparator).forEach(System.out::print);
        System.out.println();

        // Stack
        Stack<Integer> stack = new Stack<>();
        for(Integer item : myList) {
            stack.push(item);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();

        // Queue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(myList);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll());
        }
        System.out.println();

        // Queue
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(myList);
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll());
        }
        System.out.println();

        priorityQueue.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Map<Byte, String> mymap  = priorityQueue
                .stream()
                .collect(
                        Collectors.toMap(Integer::byteValue,
                                Object::toString,
                                (newValue, oldValue) -> oldValue,
                                HashMap::new)
                );


        mymap.entrySet().stream().forEach(x -> {
            if (Objects.equals(x.getValue(), "")) {
                System.out.println("Its a string");
            }

            if (x.getKey() == 1) {
                System.out.println("Its a byte");
            }
        });

        List<Byte> stringList = mymap
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Byte, String>comparingByKey().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        Deque<Integer> deque = new ArrayDeque<>(myList);
        while (!deque.isEmpty()) {
            System.out.print(deque.poll());
        }
        System.out.println();
    }
}