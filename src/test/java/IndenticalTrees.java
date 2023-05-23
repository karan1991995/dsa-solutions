class IndenticalTrees {


    public static boolean isIdentical(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null) {
            return false;
        } else if (root2 == null) {
            return false;
        } else if (root1.data != root2.data) {
            return false;
        }
        
        return (isIdentical(root1.left, root2.left) &&
                isIdentical(root1.right, root2.right));

    }

    public static void main(String str[]) throws Exception {
        Node root1 = new Node(1);
        Node root2 = new Node(1);

        root1.left = new Node(4);
        root1.left.left = new Node(4);
        root1.left.right = new Node(3);

        root2.left = new Node(4);
        root2.left.left = new Node(4);
        root2.left.right = new Node(2);


        System.out.println(isIdentical(root1, root2));
    }
}


