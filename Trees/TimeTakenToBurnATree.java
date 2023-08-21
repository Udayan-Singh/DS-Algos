package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TimeTakenToBurnATree {
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> parentss = new HashMap<>();
        TreeNode target = markParentss(root, start, parentss);
        int ans = findTime(target, parentss);
        return ans;
    }

    private int findTime(TreeNode target, HashMap<TreeNode, TreeNode> parents) {
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(target);
        visited.put(target, true);
        int curr_level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean flag = false;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null && visited.get(curr.left) == null) {
                    flag = true;
                    q.offer(curr.left);
                    visited.put(curr.left, true);
                }

                if (curr.right != null && visited.get(curr.right) == null) {
                    flag = true;
                    q.offer(curr.right);
                    visited.put(curr.right, true);
                }

                if (parents.get(curr) != null && visited.get(parents.get(curr)) == null) {
                    flag = true;
                    q.offer(parents.get(curr));
                    visited.put(parents.get(curr), true);
                }
            }
            if (flag) {
                curr_level++;
            }
        }

        return curr_level;
    }

    private TreeNode markParentss(TreeNode root, int start, HashMap<TreeNode, TreeNode> parentss) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        TreeNode res = null;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.val == start) {
                res = node;
            }

            if (node.left != null) {
                q.offer(node.left);
                parentss.put(node.left, node);
            }

            if (node.right != null) {
                q.offer(node.right);
                parentss.put(node.right, node);
            }
        }

        return res;

    }
}
