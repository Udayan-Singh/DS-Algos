package Trees;

import java.util.ArrayList;

public class BoundaryTraversal {
    ArrayList <Integer> boundary(Node node){

        ArrayList<Integer> ans = new ArrayList<>();
        if(!isLeaf(node)){
            ans.add(node.data);
        }

        addLeft(node,ans);
        addLeaves(node,ans);
        addRight(node,ans);
        return ans;
	    
	}

   private void addRight(Node node, ArrayList<Integer> ans) {
        Node curr = node.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                temp.add(curr.data);
            }

            if(curr.right!=null){
                curr = curr.right;
            }
            else if(curr.left!=null){
                curr = curr.left;
            }
        }

        for (int i = temp.size()-1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }

 private void addLeaves(Node node, ArrayList<Integer> ans) {
        if(isLeaf(node)){
            ans.add(node.data);
        }

        if(node.left!=null){
            addLeaves(node.left, ans);
        }

        if(node.right!=null){
            addLeaves(node.right, ans);
        }
    }

    private void addLeft(Node node, ArrayList<Integer> ans) {
        Node curr = node.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                ans.add(curr.data);
            }

            if(curr.left!=null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }

    private boolean isLeaf(Node node) {
        return node.left==null && node.right==null;
    }
}
