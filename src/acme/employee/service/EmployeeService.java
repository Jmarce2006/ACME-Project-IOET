/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employee.service;

import acme.employee.entity.Employee;
import java.util.List;

/**
 *
 * @author jhony
 */
public interface EmployeeService {
    public List<Employee> calculatePayFromFile(String path);
}
