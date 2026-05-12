/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;
import java.util.Scanner;


/**
 *
 * @author carolinasilva
 */
public class Main {
    
    public static void main(String[] args) {
    // Scanner used to read user input from the terminal
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("=================================");
    System.out.println("   Department Store System");
    System.out.println("=================================");
    
    // Stores the selected menu option
    MenuOptionEnum selectedOption = null;
    
         // Keep showing the menu until the user selects a valid option
    while (selectedOption == null) {
        // Loop through all enum options and display them
    for (MenuOptionEnum option : MenuOptionEnum.values()) {
        System.out.println(option.getOption() + ". " + option.getLabel());
}
   
    // Ask the user to choose an option from the menu
    System.out.print("\nSelect an option: ");
    int userChoice = scanner.nextInt();

    selectedOption = MenuOptionEnum.fromInt(userChoice);
    
    if (selectedOption == null) {
                System.out.println("Invalid option. Please try again.\n");
            }
}
    System.out.println("You selected: " + selectedOption.getLabel());

        scanner.close();
    }
}