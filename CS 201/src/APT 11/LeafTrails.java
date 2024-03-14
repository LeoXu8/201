import java.util.*;
public class LeafTrails {
    Map<Integer, String> map = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        if (tree == null) {
            return new String[0];
        }
        if (tree.left == null && tree.right == null) {
            return new String[]{""};
        }
        
        gather(tree.left, "0");
        gather(tree.right, "1");
        String[] ret = new String[map.size()];
        int i = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            ret[i++] = entry.getValue();
        }
        return ret;
    }
    public void gather(TreeNode tree, String path){
        if (tree == null) {
            return;
        }
        if (tree.left == null && tree.right == null) {
            map.put(tree.info, path);
        }
        gather(tree.left, path + "0");
        gather(tree.right, path + "1");
    }


}