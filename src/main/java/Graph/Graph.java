package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph {

//    static class Node {
//        int data;
//        boolean visited;
//        Node(int data) {
//            this.data = data;
//        }
//    }

    private List<Integer>[] adjList;
    private int numberOfVertices;
    boolean[] visited;

    public Graph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjList = new LinkedList[numberOfVertices];
        for(int index = 0; index < numberOfVertices; ++index) {
            adjList[index] = new LinkedList<>();
        }

        visited = new boolean[numberOfVertices];
    }

    public void AddEdge(int src, int dest) {
        if (src > this.numberOfVertices) {
            System.out.println("No more edge could be added");
            return;
        }
        adjList[src].add(dest);
    }

    public void BreathFirstSearch(int start) {
        Map<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.putIfAbsent(start, true);

        while(!queue.isEmpty()) {
            int data = queue.remove();
            System.out.println(data);

            for (int el : adjList[data]) {
                if (!visited.containsKey(el)) {
                    queue.add(el);
                    visited.putIfAbsent(el, true);
                }
            }
        }
    }

    public void DepthFirstSearch(int start) {
        visited[start] = true;
        System.out.println(start);

        for (int el : adjList[start]) {
            if (!visited[el]) {
                DepthFirstSearch(el);
            }
        }
    }
}
