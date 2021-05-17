/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employee.entity;

import acme.employeeschedule.entity.EmployeeSchedule;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jhony
 */
public class Employee {
    private String name;
    private List<EmployeeSchedule> employeSchedules;
    private double amountPay;

    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeSchedule> getEmployeSchedules() {
        return employeSchedules;
    }

    public void setEmployeSchedules(List<EmployeeSchedule> employeSchedules) {
        this.employeSchedules = employeSchedules;
    }

    public double getAmountPay() {
        return amountPay;
    }

    public void setAmountPay(double amountPay) {
        this.amountPay = amountPay;
    } 
}
