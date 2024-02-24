import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TopView {
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> queue = new LinkedList<>();
        TreeMap<Integer, Node> map = new TreeMap<>();

        queue.add(new Info(root, 0));

        while (!queue.isEmpty()) {
            Info info = queue.poll();
            Node node = info.node;
            int hd = info.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node);
            }

            if (node.left != null) {
                queue.add(new Info(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.add(new Info(node.right, hd + 1));
            }
        }

        for (Node node : map.values()) {
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        /*
                  1
                /    \
               2      3
              / \    / \
             4  5   7  6
        */

        System.out.println("Top View of Binary Tree:");
        topView(root);
    }
}
