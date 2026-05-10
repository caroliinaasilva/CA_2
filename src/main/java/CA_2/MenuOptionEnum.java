/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author carolinasilva
 */
// Enum used to store all menu options for the system
public enum MenuOptionEnum {
    
    SORT(1," Sort Employee List"),
    SEARCH(2, "Search Employee"),
    ADD_EMPLOYEE(3,"Add New Employee"),
    BINARY_TREE(4, "Create Employee Hierarchy (Binary Tree)"),
    EXIT(5, "Exit");
    
    private final int option; // stores the menu option number
    private final String label; // Stores the menu option label shown to the user
    
      // Constructor used to create each menu option
    MenuOptionEnum(int option, String label) {
        this.option = option;
        this.label = label;
    }
    public int getOption() {    // Returns the menu option number
        return option;
    }
     // Returns the menu option label
    public String getLabel() {
        return label;
    }
     // Converts user input into a MenuOptionEnum value
    public static MenuOptionEnum fromInt(int value) {
        // Loops through all enum options
        for (MenuOptionEnum opt : values()) {
            // Checks if the selected number matches the option
            if (opt.getOption() == value) {
                return opt;
            }
        }
        

        return null;
    
    
    }
    
    
}
