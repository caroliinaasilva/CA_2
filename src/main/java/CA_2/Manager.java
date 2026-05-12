/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author carolinasilva
 */
public class Manager {
    
    // Stores the manager type
    private String managerType;
    
    // Constructor used to create a manager object
    public Manager(String managerType) {
        this.managerType = managerType;
    }
    
    // Returns the manager type
    public String getManagerType() {
        return managerType;
    }
}