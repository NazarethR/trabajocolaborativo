/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;

/**
 *
 * @author galla
 */
public class EmployeeList implements List<Employee> {
    private Employee employee[];

    public EmployeeList() {
        this.employee = new Employee[100];
    }

    @Override
    public boolean add(Employee t) {
        
        for (int i = 0; i < 100; i++) {
            if(employee[i] == null ){
                employee[i]= t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Employee t) {
         for (int i = 0; i < 100; i++) {
            if(employee[i] == t ){
                employee[i]= null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee find(Object id) {
        for (int i = 0; i < 100; i++) {
            if (employee[i].getId() == id) {
                return employee[i];
            }
        }
        return null;
    }

    @Override
    public void ShowAll() {
        for (int i = 0; i < 100; i++) {
            System.out.println(employee[i]);
        }
   }
    
}
