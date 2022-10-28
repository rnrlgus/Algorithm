package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestToEndBFS {

    Node root;

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; ++i) {
                Node current = queue.poll();
                if (current.lt == null && current.rt == null) {
                    return level;
                }
                if(current.lt != null) queue.offer(current.lt);
                if(current.rt != null) queue.offer(current.rt);
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        ShortestToEndBFS tree = new ShortestToEndBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.BFS(tree.root));
    }
}