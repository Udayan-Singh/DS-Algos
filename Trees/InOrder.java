package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root==null){
            return ans;
        }

        TreeNode node = root;
        while(true){
            if(node!=null){
                s.push(node);
                node = node.left;
            }

            else{
                if(s.isEmpty()){
                    break;
                }
                node = s.pop();
                ans.add(node.val);
                node = node.right;
            }
        }

        return ans;
    }
}
