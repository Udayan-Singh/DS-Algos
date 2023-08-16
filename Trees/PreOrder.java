package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            ans.add(temp.val);
            
            if(temp.right!=null){
                s.push(temp.right);
            }

            if(temp.left!=null){
                s.push(temp.left);
            }
        }

        return ans;
    }
}
