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

public class 이진트리순회 {

    public void preorder(Node node) {
        if(node==null) return;
        System.out.print(node.data + " ");
        preorder(node.lt);
        preorder(node.rt);
    }

    public void inorder(Node node) {
        if(node==null) return;
        inorder(node.lt);
        System.out.print(node.data + " ");
        inorder(node.rt);
    }

    public void postorder(Node node) {
        if(node==null) return;
        postorder(node.lt);
        postorder(node.rt);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Node(1));
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        이진트리순회 solution = new 이진트리순회();

        //전위순회
        solution.preorder(tree.root);
        System.out.println();
        
        //중위순회
        solution.inorder(tree.root);
        System.out.println();
        
        //후위순회
        solution.postorder(tree.root);
    }
}




