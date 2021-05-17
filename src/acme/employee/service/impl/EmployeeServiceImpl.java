/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employee.service.impl;

import acme.employee.entity.Employee;
import acme.employee.service.EmployeeService;
import acme.employeeschedule.service.impl.EmployeeScheduleServiceImpl;
import acme.util.FileTextService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhony
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> calculatePayFromFile(String path) {
        FileTextService ft = new FileTextService();
        EmployeeScheduleServiceImpl employeeSchServiceImpl = new EmployeeScheduleServiceImpl();
        List<Employee> employeesList = new ArrayList<>();

        String fileContent = ft.readTxt(path);
        String[] contentLines = ft.contentSeparatedInLines(fileContent);

        for (int i = 0; i < contentLines.length; i++) {
            Employee em = new Employee();
            em.setName(ft.getNameEmployee(contentLines[i]));
            em.setEmployeSchedules(employeeSchServiceImpl.getEmployeeSchedules(contentLines[i]));
            em.setAmountPay(employeeSchServiceImpl.calculateAmountPayEmployee(em.getEmployeSchedules()));
            employeesList.add(em);
        }

        return employeesList;
    }

}
