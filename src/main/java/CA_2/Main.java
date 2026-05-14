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

    System.out.println( "File not found. Please try again.\n");

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

    case SEARCH:

    // Sort list before searching because binary search needs sorted data
    MergeSort searchSort = new MergeSort();
    employeeList = searchSort.sort(employeeList);

    // Clear scanner line before reading text
    scanner.nextLine();

    System.out.print("\nPlease enter employee name to search: ");
    String searchName = scanner.nextLine();

    BinarySearch binarySearch = new BinarySearch();

    Employee foundEmployee =
            binarySearch.search(
            employeeList,
            searchName,
            0,
            employeeList.size() - 1
            );

    if (foundEmployee == null) {

        System.out.println("Employee not found.");

    } else {

        System.out.println("\nEmployee found:");
        System.out.println("Name: " + foundEmployee.getName());
        System.out.println("Manager Type: " + foundEmployee.getManagerType());
        System.out.println("Department: " + foundEmployee.getDepartment());
    }

   
    case ADD_EMPLOYEE:

        // Clear scanner line
        scanner.nextLine();

        // Create InputValidator object
        InputValidator validator =
                new InputValidator();

        // Ask for employee name
        System.out.print(
                "\nPlease enter employee name: "
        );

        String newName = scanner.nextLine();

        // Validate employee name
        while (!validator.isValidName(newName)) {

            System.out.println(
                    "Invalid name. Please try again."
            );

            newName = scanner.nextLine();
        }

        // Display manager options
        System.out.println(
                "\nPlease select from the following Management Staff:"
        );

        System.out.println("1. Head Manager");
        System.out.println("2. Assistant Manager");
        System.out.println("3. Team Lead");

        int managerChoice = scanner.nextInt();

        // Validate manager option
        while (!validator.isValidManagerOption(managerChoice)) {

            System.out.println(
                    "Invalid option. Please try again."
            );

            managerChoice = scanner.nextInt();
        }

        // Display department options
        System.out.println(
                "\nPlease select the Department:"
        );

        System.out.println("1. Customer Service");
        System.out.println("2. Foreign Exchange");
        System.out.println("3. HR");

        int departmentChoice = scanner.nextInt();

        // Validate department option
        while (!validator.isValidDepartmentOption(departmentChoice)) {

            System.out.println(
                    "Invalid option. Please try again."
            );

            departmentChoice = scanner.nextInt();
        }

        // Get manager type and department name
        String managerType =
                validator.getManagerType(managerChoice);

        String department =
                validator.getDepartment(departmentChoice);

        // Create new employee object
        Employee newEmployee = new Employee(
                employeeList.size() + 1,
                newName,
                managerType,
                department
        );

        // Add employee to the list
        employeeList.add(newEmployee);

        System.out.println(
                "\n\"" + newName
                + "\" has been added as \""
                + managerType
                + "\" to \""
                + department
                + "\" successfully!"
        );

        break;
}

scanner.close();
    }
}