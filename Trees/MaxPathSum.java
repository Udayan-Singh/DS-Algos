package Trees;

public class MaxPathSum {
    int ans;
    public int maxPathSum(TreeNode root){
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
    private int helper(TreeNode root) {
        if(root == null){
            return 0;
        }

        int ltree = Math.max(0, helper(root.left));
        int rtree = Math.max(0, helper(root.right));

        ans = Math.max(ans, ltree + rtree + root.val);

        return Math.max(ltree,rtree) + root.val;
    }
}
