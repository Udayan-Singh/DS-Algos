package Trees.BST;

public class InsertInBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode node = root;
        while (true) {
            if (node.val <= val) {
                if (node.right != null) {
                    node = node.right;
                }

                else {
                    node.right = new TreeNode(val);
                    break;
                }
            }

            else {
                if (node.left != null) {
                    node = node.left;
                }

                else {
                    node.left = new TreeNode(val);
                    break;
                }
            }
        }

        return root;
    }
}
