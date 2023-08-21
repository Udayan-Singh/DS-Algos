package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodesAtDistanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        markParents(root, parent, target);

        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target, true);
        int curr_level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            if (curr_level == k) {
                break;
            }

            curr_level++;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null && visited.get(curr.left) == null) {
                    q.offer(curr.left);
                    visited.put(curr.left, true);
                }

                if (curr.right != null && visited.get(curr.right) == null) {
                    q.offer(curr.right);
                    visited.put(curr.right, true);
                }

                if (parent.get(curr) != null && visited.get(parent.get(curr)) == null) {
                    q.offer(parent.get(curr));
                    visited.put(parent.get(curr), true);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }

        return ans;
    }

    private void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parent, TreeNode target) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();

            if (current.left != null) {
                q.offer(current.left);
                parent.put(current.left, current);
            }

            if (current.right != null) {
                q.offer(current.right);
                parent.put(current.right, current);
            }
        }
    }
}
