
import java.util.ArrayList;
import java.util.List;

class inOrderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        } else {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }


    public static void main(String str[]) throws Exception {

        TreeNode tr = new TreeNode(1);
//        tr.right = new TreeNode(2);
//        tr.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(tr));

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
