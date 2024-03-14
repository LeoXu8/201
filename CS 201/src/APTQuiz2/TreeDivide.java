import java.util.Arrays;
public class TreeDivide {
    public TreeNode create(String[] list) {
        if (list.length == 0) {
            return null;
        }
        int n = list.length;
        TreeNode root = new TreeNode(list[n/2].length());
        root.left = create(Arrays.copyOfRange(list, 0, n/2));
        root.right = create(Arrays.copyOfRange(list, n/2+1, n));
        return root;
    }
}