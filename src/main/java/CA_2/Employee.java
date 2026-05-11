/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author carolinasilva
 */
public class Employee {
    
    // Basic employee details used by the system
    private String name;
    private String managerType;
    private String department;
    
    // Constructor used to create a new employee object
    public Employee(String name, String managerType, String department) {
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }
    // Returns the employee name
    public String getName() {
        return name;
    }

    // Returns the employee manager type
    public String getManagerType() {
        return managerType;
    }

    // Returns the employee department
    public String getDepartment() {
        return department;
    }

    // Displays employee details in a readable format
    @Override
    public String toString() {
        return name + " | " + managerType + " | " + department;
 
    }
}
