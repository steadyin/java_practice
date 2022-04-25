package inflearn;

import java.util.LinkedList;
import java.util.Queue;

public class TREE말단노드까지가장짧은경로BFS {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(1));
        binaryTree.root.lt = new Node(2);
        binaryTree.root.rt = new Node(3);
        binaryTree.root.lt.lt = new Node(4);
        binaryTree.root.lt.rt = new Node(5);
        binaryTree.root.rt.lt = new Node(6);
        binaryTree.root.rt.rt = new Node(7);

        TREE말단노드까지가장짧은경로BFS solution = new TREE말단노드까지가장짧은경로BFS();

        System.out.println(solution.solution(binaryTree.root));
    }

    private int solution(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty())  {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                Node temp = queue.poll();

                if(temp.lt==null && temp.rt==null)  return level;

                if(temp.lt!=null) queue.offer(temp.lt);
                if(temp.rt!=null) queue.offer(temp.rt);
            }
            level++;
        }
        return -1;
    }
}


