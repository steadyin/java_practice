package inflearn;

public class TREE말단노드까지가장짧은경로DFS {
    public int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(1));
        binaryTree.root.lt = new Node(2);
        binaryTree.root.rt = new Node(3);
        binaryTree.root.lt.lt = new Node(4);
        binaryTree.root.lt.rt = new Node(5);

        TREE말단노드까지가장짧은경로DFS solution = new TREE말단노드까지가장짧은경로DFS();

        System.out.println(solution.solution2(binaryTree.root, 0));

    }

    private void solution1(Node node, int level) {
        if(node.lt == null && node.rt==null)    {
            if(answer>level) answer = level;
            return;
        }

        if(node.lt!=null)   solution1(node.lt, level + 1);
        if(node.rt!=null)   solution1(node.rt, level + 1);
        return;
    }

    //한쪽 자식 노드만 있는 경우 오류 발생
    private int solution2(Node node, int level) {
        if(node.lt == null && node.rt==null)    return level;
        else    return Math.min(solution2(node.lt, level + 1), solution2(node.rt, level + 1));
    }
}

