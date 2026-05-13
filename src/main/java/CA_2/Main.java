/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;
import java.util.Scanner;
import java.util.ArrayList;


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

     // Stores all employees read from the file
    ArrayList<Employee> employeeList = new ArrayList<>();

    // Controls if the file was loaded successfully
    boolean fileLoaded = false;

    // Keep asking for the file name until the file is found
    while (!fileLoaded) {

    System.out.print("Please enter the filename to read: ");
    String fileName = scanner.nextLine();

    // Create FileHandler object
    FileHandler fileHandler = new FileHandler();

    // Read employees from the file
    employeeList = fileHandler.readFile(fileName);

    // Check if the file was loaded correctly
    if (employeeList.isEmpty()) {

    System.out.println(
                        "File not found. Please try again.\n");

    } else {

     fileLoaded = true;
            }
}

    // Stores the selected menu option
    MenuOptionEnum selectedOption = null;

    // Keep showing the menu until the user selects a valid option
    while (selectedOption == null) {

    // Loop through all enum options and display them
    for (MenuOptionEnum option : MenuOptionEnum.values()) {

         System.out.println(  option.getOption() + ". "  + option.getLabel()
         );
}

     // Ask the user to choose an option from the menu
            System.out.print("\nSelect an option: ");

    int userChoice = scanner.nextInt();

    // Convert user choice into enum option
            selectedOption = MenuOptionEnum.fromInt(userChoice);

     // Check if the selected option exists
    if (selectedOption == null) {

        System.out.println("Invalid option. Please try again.\n"
                );
            }
        }

        System.out.println(  "You selected: " + selectedOption.getLabel() );

     // Execute the selected menu option
    switch (selectedOption) {

        case SORT:

    // Create MergeSort object
        MergeSort mergeSort = new MergeSort();

        // Sort employee list alphabetically
        employeeList = mergeSort.sort(employeeList);

       System.out.println( "\nFirst 20 Employees:\n"  );

        // Display only the first 20 employees
        for (int i = 0; i < employeeList.size() && i < 20;i++) {

        System.out.println( employeeList.get(i).getName());
 }

    break;
    }     
    scanner.close();
    }
}