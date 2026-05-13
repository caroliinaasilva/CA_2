/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;


import java.util.ArrayList;

/**
 *
 * @author carolinasilva
 */
public class BinarySearch {
    
    // Searches for an employee by name using recursive binary search
    public Employee search( ArrayList<Employee> list, String targetName, int left, int right) {

   // Base case: employee was not found
    if (left > right) {
        return null;
}

     // Find the middle position
   int middle = (left + right) / 2;

     // Get the employee name from the middle position
    String middleName = list.get(middle).getName();

     // Compare the searched name with the middle name
    int comparison = targetName.compareTo(middleName);

     if (comparison == 0) {

     // Employee found
        return list.get(middle);

    } else if (comparison < 0) {

     // Search the left side
       return search(list, targetName, left, middle - 1);

    } else {

     // Search the right side
     return search(list, targetName, middle + 1, right);
        }
    }
}    
    

