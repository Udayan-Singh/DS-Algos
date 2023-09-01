package Trees.BST;

public class Floor {
    public static int floor(Node root, int x) {
        if (root == null) {
            return -1;
        }

        int ans = -1;
        while (root != null) {
            if (root.data == x) {
                return root.data;
            }

            else if (root.data < x) {
                ans = root.data;
                root = root.right;
            }

            else {
                root = root.left;
            }
        }

        return ans;
    }
}
