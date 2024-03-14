import java.util.ArrayList;
import java.util.List;

public class LeafCollector {

    public String[] getLeaves(TreeNode tree) {
        List<String> rounds = new ArrayList<>();
        while (tree != null) {
            String round = getLowestLevel(tree);
            rounds.add(round.substring(0, round.length() - 1));
            tree = removeLeaves(tree);
        }
        String[] ret = new String[rounds.size()];
        return rounds.toArray(ret);
    }
    public String getLowestLevel(TreeNode tr){
        if (tr == null){
            return "";
        }
        else if (tr.right == null && tr.left == null){
            int v = tr.info;
            return Integer.toString(v) + " ";
        }
        else{
            return getLowestLevel(tr.left) + getLowestLevel(tr.right);
        }
    }
    public TreeNode removeLeaves(TreeNode tr) {
        if (tr == null) {
            return null;
        }
        else if (tr.right == null && tr.left == null) {
            return null;
        }
        else {
            tr.left = removeLeaves(tr.left);
            tr.right = removeLeaves(tr.right);
            return tr;
        }
    }
}
