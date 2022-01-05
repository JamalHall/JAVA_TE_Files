package com.techelevator;

public class Employee {
    //variable instances
    public	int	employeeId;
    public	String	firstName;
    public	String	lastName;
    public	String	department;
    public	double	annualSalary;

    //constructor
    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }

    // methods
    public void raiseSalary(double percent){
        annualSalary = annualSalary*(1+percent/100);
    }

    //derived value
    public String getFullName() {
        return lastName + ", " + firstName;
    }
    //setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
}
