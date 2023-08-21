package Trees;

public class CountNodesCompleteBT {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = findLeft(root);
        int rh = findRight(root);

        if (lh == rh) {
            return 2 << lh - 1;
        }

        else
            return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int findRight(TreeNode root) {
        int count = 0;
        while (root.right != null) {
            count++;
            root = root.right;
        }
        return count;
    }

    private int findLeft(TreeNode root) {
        int count = 0;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;
    }
}
