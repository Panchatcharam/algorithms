package BST;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BinarySearchTree {

    Node root = null;

    public static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void Add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node current = root;
            while(true) {
                if (value > current.value) {
                    if (current.right == null) {
                        current.right = new Node(value);
                    }
                    current = current.right;

                } else if (value < current.value) {
                    if (current.left == null) {
                        current.left = new Node(value);
                    }
                    current = current.left;
                } else {
                    return;
                }
            }
        }
    }

    public List<Integer> GetSorted() {
        Node current = root;
        List<Integer> sorted = new LinkedList<>();
        while(true){
            sorted.add(current.value);
        }
    }

    public List<Integer> BFS() {
        Queue<Node> queue = new ConcurrentLinkedDeque<>();
        List<Integer> visted = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node current = queue.remove();
            visted.add(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return visted;
    }

    public List<Integer> PreOrder() {
        List<Integer> data = new LinkedList<>();
        PreOderTraverse(root, data);
        return data;
    }

    private void PreOderTraverse(Node node, List<Integer> data) {
        data.add(node.value);
        if (node.left != null) PreOderTraverse(node.left, data);
        if (node.right != null) PreOderTraverse(node.right, data);
    }

    public List<Integer> PostOrder() {
        List<Integer> data = new LinkedList<>();
        PostOderTraverse(root, data);
        return data;
    }

    private void PostOderTraverse(Node node, List<Integer> data) {
        if (node.left != null) PostOderTraverse(node.left, data);
        if (node.right != null) PostOderTraverse(node.right, data);
        data.add(node.value);
    }

    public List<Integer> InOrder() {
        List<Integer> data = new LinkedList<>();
        InOderTraverse(root, data);
        return data;
    }

    private void InOderTraverse(Node node, List<Integer> data) {
        if (node.left != null) InOderTraverse(node.left, data);
        data.add(node.value);
        if (node.right != null) InOderTraverse(node.right, data);
    }
}
