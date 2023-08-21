package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialise {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                res.append("n ");
                continue;
            }

            res.append(curr.val + " ");
            q.add(curr.left);
            q.add(curr.right);
        }

        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == "") {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);

        for (int i = 1; i < values.length; i++) {
            TreeNode parent = q.poll();
            if (!values[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }

            if (!values[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }

        return root;

    }
}
