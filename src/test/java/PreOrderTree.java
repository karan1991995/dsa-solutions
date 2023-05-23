import java.util.ArrayList;
import java.util.List;

class PreOrderTree {


    static ArrayList<Integer> preorder(Node root) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        result.add(root.data);
        if (root.left != null)
            result.addAll(preorder(root.left));
        if (root.right != null)
            result.addAll(preorder(root.right));
        return result;

    }

    public static void main(String str[]) throws Exception {
        Node tempNode = new Node(1);
        tempNode.left = new Node(4);
        tempNode.left.left = new Node(4);
        tempNode.left.right = new Node(2);
        System.out.println(preorder(tempNode));
    }
}

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
