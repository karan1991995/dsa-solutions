class isSameTreeClass {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) {
            return q == null;
        }
        if (q == null) {
            return false;
        }
        
        if (p.val != q.val) {
            return false;
        }

        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }

    public static void main(String str[]) throws Exception {
        TreeNode tr1 = new TreeNode(1);
        tr1.left = new TreeNode(1);
        tr1.right = new TreeNode(3);

        TreeNode tr2 = new TreeNode(1);
        tr2.left = new TreeNode(2);
        tr2.right = new TreeNode(3);

        System.out.println(isSameTree(tr1, tr2));

    }

}
