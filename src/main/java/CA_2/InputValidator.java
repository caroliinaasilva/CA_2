/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author carolinasilva
 */
public class InputValidator {

    // Checks if the employee name is not empty
    public boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    // Checks if the manager option is valid
    public boolean isValidManagerOption(int option) {

        return option >= 1 && option <= 3;
    }

    // Checks if the department option is valid
    public boolean isValidDepartmentOption(int option) {

        return option >= 1 && option <= 3;
    }

    // Returns manager type based on user choice
    public String getManagerType(int option) {

        switch (option) {

            case 1:
                return "Head Manager";

            case 2:
                return "Assistant Manager";

            case 3:
                return "Team Lead";

            default:
                return "";
        }
    }

    // Returns department based on user choice
    public String getDepartment(int option) {

        switch (option) {

        case 1:
        return "Customer Service";
        
        case 2:
        return "Foreign Exchange";

        case 3:
        return "HR";

        default:
        return "";
        }
    }
}    