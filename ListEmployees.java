/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;
import java.util.ArrayList;
// * @author SR Laptop
// */
public class ListEmployees {
public static void main(String[]args){
    ArrayList<Employee> Employees=new ArrayList<>();
    Employees.add(new Employee("Hafsa",10000));
     Employees.add(new Employee("Mishal",20000));
     Employees.add(new Employee("Ayesha",30000));
     System.out.println("Employee details");
     for(Employee e1: Employees){
         e1.DisplayInfo();
     }
     Employees.remove(1); // Removing second employee (Mishal)
        System.out.println("\nEmployee details after removal:");
        for (Employee e1 : Employees) {
            e1.DisplayInfo();
        }
     
}
}


