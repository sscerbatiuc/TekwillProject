/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {

    // Instance variables
    private String name;
    private String surname;
    private int age;
    private int year; 
    private int id;
    
    protected static int staticInt;
    
    // 1st block
    {
        name = "Test";
        surname = "surname";
    }
    
    // 1st STATIC block
    static {
        
    }
    
 
    
    public void displayAge(){
        System.out.println(age);
    }
    
    // 2nd block
    {
        id = 0;
    }

    public Employee() {
        System.out.println("Employee: Default constructor called");
    }
// Employee vasea = new Employee("Vasea"....
    // Employee petea = new Employee("Petea"..
    public Employee(String name, String surname) {
        System.out.println("Constructor with 2 params");
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }
    
    public Employee(String name, String surname, int age, int id){
        this(name, surname, age);
        this.id = id;
        this.show();
    }
    
    public void mergeEmployee(Employee employee){
        System.out.println("MergeEmployee:");
        employee.show();
    }
    
    public void mergePerson(Person person){
        
    }
    
    public void cloneEmployee(){
        // this = emp
        // emp.mergeEmployee(emp)
        mergeEmployee(this);
    }
    
    public void show(){
        System.out.println("Name:" + name + " Surname: " + surname);
    }
}

class EmployeeDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.show();
        employee.displayAge();
    }
    
}
