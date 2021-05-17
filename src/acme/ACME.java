/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme;

import acme.employee.entity.Employee;
import acme.employee.service.impl.EmployeeServiceImpl;
import acme.employeeschedule.service.impl.EmployeeScheduleServiceImpl;
import java.util.List;

/**
 *
 * @author jhony
 */
public class ACME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EmployeeServiceImpl em = new EmployeeServiceImpl();
        List<Employee> employeesList = em.calculatePayFromFile(System.getProperty("user.dir")+"/src/input.txt");
        for (Employee employee : employeesList) {
            System.out.println("The amount to pay "+employee.getName()+" is: "+employee.getAmountPay()+" USD");
        }
    }
    
}
