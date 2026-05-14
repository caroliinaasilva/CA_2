/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author carolinasilva
 */
public class TreeNode {
    // Stores the employee data in this node
    Employee employee;

    // Left child node
    TreeNode left;

    // Right child node
    TreeNode right;

    // Constructor used to create a tree node
    public TreeNode(Employee employee) {
        this.employee = employee;
        this.left = null;
        this.right = null;
    }
}
