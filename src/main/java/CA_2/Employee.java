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
    private int employeeId;
    private String name;
    private String managerType;
    private String department;
    
    // Constructor used to create a new employee object
    public Employee(int employeeId, String name, String managerType, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }
    public int getEmployeeId(){
        return employeeId;
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
    // Returns all employee information in one string
    public String getDetails(){
        return employeeId + " - " + name + " | " + managerType + " | " + department;
    }
    // Updates the employee department
    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }
    // Returns employee details when the object is printed
   public String toString(){
       return getDetails();
   
    }
}
