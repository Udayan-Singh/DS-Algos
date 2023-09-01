package Trees.BST;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        while (root != null) {
            if (val == root.val) {
                return root;
            }

            if (val > root.val) {
                root = root.right;
            }

            else {
                root = root.left;
            }
        }

        return null;
    }
}
