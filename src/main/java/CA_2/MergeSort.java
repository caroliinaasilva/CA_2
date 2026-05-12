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
public class MergeSort {


    // Sorts employee list alphabetically by employee name
    public ArrayList<Employee> sort(ArrayList<Employee> list) {

    // Base case: if the list has 0 or 1 element, it is already sorted
    if (list.size() <= 1) {
        return list;
}

    // Find the middle of the list
     int middle = list.size() / 2;

     // Split the list into left and right sides
    ArrayList<Employee> left =
         new ArrayList<>(list.subList(0, middle));

    ArrayList<Employee> right =
         new ArrayList<>(list.subList(middle, list.size()));

    // Recursively sort both sides
        left = sort(left);
        right = sort(right);

   // Merge both sorted lists
        return merge(left, right);
    }

    // Merges two sorted lists into one sorted list
    private ArrayList<Employee> merge(
            ArrayList<Employee> left,
            ArrayList<Employee> right) {

        ArrayList<Employee> sortedList = new ArrayList<>();

     int i = 0;
     int j = 0;

        // Compare employee names alphabetically
    while (i < left.size() && j < right.size()) {

        if (left.get(i).getName().compareTo(
                    right.get(j).getName()) <= 0) {

    sortedList.add(left.get(i));
         i++;

     } else {

        sortedList.add(right.get(j));
        j++;
    }
 }

    // Add remaining employees from the left list
    while (i < left.size()) {

        sortedList.add(left.get(i));
        i++;
        }

    // Add remaining employees from the right list
    while (j < right.size()) {

        sortedList.add(right.get(j));
        j++;
        }

    return sortedList;
    }
}
    

