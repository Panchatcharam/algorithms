package dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Dijkstra {
    Map<String, List<Vertex>> adjacencyList;

    Dijkstra(int size) {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String src, String dest, int weight) {
        if (adjacencyList.containsKey(src)) {
            adjacencyList.get(src).add(new Vertex(dest, weight));
        }

        if (adjacencyList.containsKey(dest)) {
            adjacencyList.get(dest).add(new Vertex(src, weight));
        }
    }

    static class base {

    }

    static class Vertex extends base implements Comparable<Vertex> {
        String name;
        int weight;
        Vertex(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public int compareTo(Vertex o) {
            return this.weight - o.weight;
        }
    }

    List<String> findShortestPath(String src, String dest) {
        Map<String, Integer> distance = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        Map<String, Boolean> visited = new HashMap<>();

        for (var entry : adjacencyList.entrySet()) {
            if (entry.getKey().equals(src)) {
                distance.put(entry.getKey(), 0);
                queue.add(new Vertex(entry.getKey(), 0));
            } else {
                distance.put(entry.getKey(), Integer.MAX_VALUE);
                queue.add(new Vertex(entry.getKey(), Integer.MAX_VALUE));
            }
            previous.put(entry.getKey(), null);
            visited.put(entry.getKey(), false);;
        }

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            if (vertex.name.equals(dest)) {
                // We are done return
            }

            if (distance.get(vertex.name) != Integer.MAX_VALUE) {

            }
        }

        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Dijkstra graph = new Dijkstra(6);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.addEdge("A", "B", 4);
        graph.addEdge("A", "C", 2);
        graph.addEdge("B", "E", 3);
        graph.addEdge("C", "D", 2);
        graph.addEdge("C", "F", 4);
        graph.addEdge("D", "E", 3);
        graph.addEdge("D", "F", 1);
        graph.addEdge("E", "F", 1);

        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        queue.add(new Vertex("A", 10));
        queue.add(new Vertex("B", 8));
        queue.add(new Vertex("C", 20));
        queue.add(new Vertex("D", 1));
        queue.add(new Vertex("E", 18));

        System.out.println();
//        System.out.println(queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().weight);
        }

    }


    // should we store hits to report to partners if they were down?
    // server to server notifications???
}
