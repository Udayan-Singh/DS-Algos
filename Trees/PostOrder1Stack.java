package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder1Stack {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;

        while(curr!=null || !s.isEmpty()){
            if(curr!=null){
                s.push(curr);
                curr = curr.left;
            }

            else{
                TreeNode temp = s.peek().right;
                if(temp==null){
                    temp = s.peek();
                    s.pop();
                    ans.add(temp.val);

                    while(!s.isEmpty() && temp == s.peek().right){
                        temp = s.pop();
                        ans.add(temp.val);
                    }
                }
                else{
                    curr = temp;
                }
            }
        }
        return ans;
    }
}
