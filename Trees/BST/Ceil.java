package Trees.BST;

public class Ceil {
    int findCeil(Node root, int key) {
        if (root == null)
            return -1;

        int ans = -1;
        Node curr = root;

        while (curr != null) {
            if (curr.data == key) {
                return curr.data;
            }

            if (curr.data > key) {
                ans = curr.data;
                curr = curr.left;
            }

            else if (curr.data < key) {
                curr = curr.right;
            }
        }

        return ans;
    }
}
