import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        int[] treeArray = treeToArray(root);
        Arrays.sort(treeArray);
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i = 0; i < treeArray.length; i++) {
            uniqueValues.add(treeArray[i]);
        }
        int[] result = new int[uniqueValues.size()];
        int i = 0;
        for (int value : uniqueValues) {
            result[i] = value;
            i++;
        }
        Arrays.sort(result);
        return result;
    }

    public int[] treeToArray(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        if (root == null) {
            return new int[0];
        }
        nodeList.add(root.info);
        if (root.left != null) {
            int[] leftArray = treeToArray(root.left);
            for (int i = 0; i < leftArray.length; i++) {
                nodeList.add(leftArray[i]);
            }
        }
        if (root.right != null) {
            int[] rightArray = treeToArray(root.right);
            for (int i = 0; i < rightArray.length; i++) {
                nodeList.add(rightArray[i]);
            }
        }

        int[] result = new int[nodeList.size()];
        for (int i = 0; i < nodeList.size(); i++) {
            result[i] = nodeList.get(i);
        }

        return result;
    }
}