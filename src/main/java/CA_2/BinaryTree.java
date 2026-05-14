/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author carolinasilva
 */
public class BinaryTree {
    // Root node of the tree
    private TreeNode root;

    // Constructor starts the tree as empty
    public BinaryTree() {
        this.root = null;
 }

    // Inserts employees using level-order insertion
    public void insert(Employee employee) {

     TreeNode newNode = new TreeNode(employee);

    if (root == null) {
        root = newNode;
            return;
 }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

    TreeNode current = queue.remove();

    if (current.left == null) {
        current.left = newNode;
        return;
}   else {
            queue.add(current.left);
        }

     if (current.right == null) {
     current.right = newNode;
        return;
         } else {
                queue.add(current.right);
        }
    }
}

    // Displays the tree using level-order traversal
    public void displayLevelOrder() {

        if (root == null) {
            System.out.println("No employee records found.");
            return;
}

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

    TreeNode current = queue.remove();

     System.out.println(current.employee.getDetails());

    if (current.left != null) {
        queue.add(current.left);
 }

     if (current.right != null) {
         queue.add(current.right);
            }
    }
}

    // Calculates the height of the tree
    public int getHeight() {
        return calculateHeight(root);
    }

    // Recursive method used to calculate height
    private int calculateHeight(TreeNode node) {

    if (node == null) {
            return 0;
    }

    int leftHeight = calculateHeight(node.left);
    int rightHeight = calculateHeight(node.right);

    return 1 + Math.max(leftHeight, rightHeight);
}

    // Counts all nodes in the tree
    public int countNodes() {
        return countNodes(root);
}

    // Recursive method used to count nodes
    private int countNodes(TreeNode node) {

    if (node == null) {
            return 0;
        }

        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
