package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    // Java program for different tree traversals

    /* Class containing left and right child of current
    node and key value*/
    static class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }

        public Node() {

        }
    }

    static class Result {
        private int val;
        public int getVal() { return val; }
        public int setVal(int val) { return this.val = val; }
    }

    static class BinaryTree
    {
        // Root of Binary Tree
        Node root;

        BinaryTree()
        {
            root = null;
        }

        /* Given a binary tree, print its nodes according to the
        "bottom-up" postorder traversal. */
        void printPostorder(Node node)
        {
            if (node == null)
                return;

            // first recur on left subtree
            printPostorder(node.left);

            // then recur on right subtree
            printPostorder(node.right);

            // now deal with the node
            System.out.print(node.key + " ");
        }

        /* Given a binary tree, print its nodes in inorder*/
        void printInorder(Node node)
        {
            if (node == null)
                return;

            /* first recur on left child */
            printInorder(node.left);

            /* then print the data of node */
            System.out.print(node.key + " ");

            /* now recur on right child */
            printInorder(node.right);
        }

        /* Given a binary tree, print its nodes in preorder*/
        void printPreorder(Node node)
        {
            if (node == null)
                return;

            /* first print data of node */
            System.out.print(node.key + " ");

            /* then recur on left sutree */
            printPreorder(node.left);

            /* now recur on right subtree */
            printPreorder(node.right);
        }

        void printReverseInOrder(Node node) {
            if (node == null) {
                return;
            }
            printReverseInOrder(node.right);
            System.out.print(node.key + " ");
            printReverseInOrder(node.left);
        }

        void printLevelOrderTraversal(Node node) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                Node data = queue.poll();
                System.out.print(data.key + " ");

                if (data.left != null)
                    queue.add(data.left);

                if (data.right != null)
                    queue.add(data.right);
            }
        }

        int printHeightOfTree(Node node) {
            if (node == null) {
                return 0;
            } else {
                int leftHeight = printHeightOfTree(node.left);
                int rightHeight = printHeightOfTree(node.right);

                if (leftHeight > rightHeight) {
                    return leftHeight + 1;
                } else {
                    return rightHeight + 1;
                }
            }
        }
        
        void printGivenLevel(Node node, int level) {
            if (node == null) {
                return;
            }
            else if (level == 1) {
                System.out.print(node.key + " ");
            } else {
                printGivenLevel(node.left, level - 1);
                printGivenLevel(node.right, level - 1);
            }
        }

        int printMinDepthOfTree(Node node, int depth) {
            if (node == null) {
                return depth;
            }

            ++depth;

            return Math.min(printMinDepthOfTree(node.left, depth), printMinDepthOfTree(node.right, depth));
        }

        int printMaxPathSum(Node node, Result result) {

            if (node == null) {
                return 0;
            }

            int left = printMaxPathSum(node.left, result);
            int right = printMaxPathSum(node.right, result);

            int max_Single = Math.max(Math.max(left, right) + node.key, node.key );

            result.setVal(Math.max(max_Single, left + right + node.key));

            return max_Single;
        }


        // Wrappers over above recursive functions
        void printPostorder() {	 printPostorder(root); }
        void printInorder() {	 printInorder(root); }
        void printPreorder() {	 printPreorder(root); }
        void printReverseInOrder() { printReverseInOrder(root); }
        void printLevelOrderTraversal() { printLevelOrderTraversal(root); }
        void printHeightOfTree() { System.out.println(printHeightOfTree(root));}
        void printGivenLevel(int level) { printGivenLevel(root, level); }
        void printMinDepth() { System.out.println(printMinDepthOfTree(root, 0)); }
        void printMaxPathSum() {
            Result result = new Result();
            result.setVal(0);
            printMaxPathSum(root, result);
            System.out.print(result.getVal());
        }


        // Driver method
        public static void main(String[] args)
        {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
//            tree.root.left.right.left = new Node(7);
//            tree.root.left.right.right = new Node(8);
//            tree.root.left.right.right.right = new Node(11);
//            tree.root.left.right.right.right.left = new Node(15);

            System.out.println("Preorder traversal of binary tree is ");
            tree.printPreorder();

            System.out.println("\nInorder traversal of binary tree is ");
            tree.printInorder();

            System.out.println("\nReverse Inorder traversal of binary tree is ");
            tree.printReverseInOrder();

            System.out.println("\nPostorder traversal of binary tree is ");
            tree.printPostorder();

            System.out.println("\nLevel order traversal of binary tree is ");
            tree.printLevelOrderTraversal();

            System.out.println("\nThe height of binary tree is ");
            tree.printHeightOfTree();

            System.out.println("\nThe given level of a binary tree is ");
            tree.printGivenLevel(4);

            System.out.println("\nThe min depth of a binary tree is ");
            tree.printMinDepth();

            System.out.println("\nThe max path of a binary tree is ");
            tree.printMaxPathSum();
        }
    }
}
