import java.util.ArrayList;

class HeightOfTree {


    static int height(Node root) {
        // Code here
        int result = 0;

        if (root == null) {
            return 0;
        }
        result++;
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) {
            leftHeight = height(root.left);
        }
        if (root.right != null) {
            rightHeight = height(root.right);
        }
        return result + Math.max(leftHeight, rightHeight);

    }

    public static void main(String str[]) throws Exception {
        Node tempNode = new Node(1);
        tempNode.left = new Node(4);
        tempNode.left.left = new Node(4);
        tempNode.left.right = new Node(2);
        System.out.println(height(tempNode));
    }
}


