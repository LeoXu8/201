public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) return null;
        t.info = height(t);
        t.left = rewire(t.left);
        t.right = rewire(t.right);
        return t;
    }
    public int height(TreeNode t){
        if (t == null) return 0;
        return Math.max(height(t.left), height(t.right)) + 1;
    }
}
