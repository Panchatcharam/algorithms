package tree;

import java.util.Stack;

public class StackBFS {

    public void printInOrderWithStack(Traversal.Node root) {

        Stack<Traversal.Node> stack = new Stack<>();
        stack.push(root);
        //      6
        //    /    \
        //   2      8
        //  / \    /  \
        // 1   3  7    9
        while(root != null || !stack.isEmpty()) {
            Traversal.Node node = stack.pop();
//            System.out.println(node.key);
            while(node.left != null) {
                node = node.left;
                stack.push(node);
            }


        }

    }

    //      6
    //    /    \
    //   2      8
    //  / \    /  \
    // 1   3  7    9
    public static void main(String[] args) {
        Traversal.BinaryTree tree = new Traversal.BinaryTree();
        tree.root = new Traversal.Node(6);
        tree.root.left = new Traversal.Node(2);
        tree.root.right = new Traversal.Node(8);
        tree.root.left.left = new Traversal.Node(1);
        tree.root.right.right = new Traversal.Node(9);
        tree.root.right.left = new Traversal.Node(7);
        tree.root.left.right = new Traversal.Node(3);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
