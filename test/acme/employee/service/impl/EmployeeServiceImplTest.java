/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employee.service.impl;

import acme.employee.entity.Employee;
import acme.employeeschedule.service.impl.EmployeeScheduleServiceImpl;
import acme.util.FileTextService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhony
 */
public class EmployeeServiceImplTest {
    
    public EmployeeServiceImplTest() {
    }

    /**
     * Test of calculatePayFromFile method, of class EmployeeServiceImpl.
     */
    @Test
    public void testCalculatePayFromFile() {
        FileTextService ft = new FileTextService();
        EmployeeScheduleServiceImpl employeeSchServiceImpl = new EmployeeScheduleServiceImpl();
        List<Employee> employeesList = new ArrayList<>();

        String fileContent = ft.readTxt(System.getProperty("user.dir")+"/src/input.txt");
        String[] contentLines = ft.contentSeparatedInLines(fileContent);

        for (int i = 0; i < contentLines.length; i++) {
            Employee em = new Employee();
            em.setName(ft.getNameEmployee(contentLines[i]));
            em.setEmployeSchedules(employeeSchServiceImpl.getEmployeeSchedules(contentLines[i]));
            em.setAmountPay(employeeSchServiceImpl.calculateAmountPayEmployee(em.getEmployeSchedules()));
            employeesList.add(em);
        }
    }
    
}
