/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employeeschedule.service;

import acme.employeeschedule.entity.EmployeeSchedule;
import acme.schedule.entity.Schedule;
import java.util.List;

/**
 *
 * @author jhony
 */
public interface EmployeeScheduleService {
    public int calculateTotalHours(String inHour, String outHour);
    
    public double calculateTotalCost(Schedule schedule, int totalHours);
    
    public double calculateAmountPayEmployee(List<EmployeeSchedule> employeeSchedules);
    
    public List<EmployeeSchedule> getEmployeeSchedules(String lineSchedules);
}
