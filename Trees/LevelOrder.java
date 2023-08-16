package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);

                if(node.left!=null){
                    q.offer(node.left);
                }

                if(node.right!=null){
                    q.offer(node.right);
                }
            }

            ans.add(list);
        }
        return ans;
    }
}
