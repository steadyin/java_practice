package inflearn;

//class Node {
//    int root;
//    Node lt;
//    Node rt;
//
//    public Node(int data) {
//        this.root = data;
//        lt = rt = null;
//    }
//}

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리순회BFS {
    private void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(l + " : ");
            for(int i=0; i<len; i++) {
                Node curNode = queue.poll();
                System.out.print(curNode.data + " ");
                if(curNode.lt!=null) queue.offer(curNode.lt);
                if(curNode.rt!=null) queue.offer(curNode.rt);
            }
            l++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(1));
        binaryTree.root.lt = new Node(2);
        binaryTree.root.rt = new Node(3);
        binaryTree.root.lt.lt = new Node(4);
        binaryTree.root.lt.rt = new Node(5);
        binaryTree.root.rt.lt = new Node(6);
        binaryTree.root.rt.rt = new Node(7);

        이진트리순회BFS solution = new 이진트리순회BFS();
        solution.BFS(binaryTree.root);
    }
}
