import java.util.LinkedList;
import java.util.Queue;
public class QueueBFS {
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        // Create a queue for level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();

        // Enqueue the root node
        queue.add(root);

        // Process each level
        while (!queue.isEmpty()) {
            // Dequeue a node
            TreeNode current = queue.poll();

            // Process the dequeued node (e.g., print its value)
            System.out.println(current.value + " ");

            System.out.println("Queue:" + queue.toString());

            // Enqueue the children of the dequeued node
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level-order traversal
        System.out.println("Level-order traversal:");
        levelOrderTraversal(root);
        System.out.println("\nIn-order traversal:");
        inOrder(root);
    }
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }
}

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

