package Trees;

public class BalancedBT {
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        if(Math.abs(lh-rh) > 1){
            return false;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if(!left || !right){
            return false;
        }

        return true;
    }

    private int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh,rh);

    }
}
