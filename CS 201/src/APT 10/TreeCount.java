public class TreeCount {
        public int count(TreeNode tree) {
            if (tree == null) return 0;
            return count(tree.left) + count(tree.right) + 1;
        }
    }