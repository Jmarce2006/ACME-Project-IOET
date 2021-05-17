/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employeeschedule.service.impl;

import acme.employeeschedule.entity.EmployeeSchedule;
import acme.employeeschedule.service.EmployeeScheduleService;
import acme.schedule.entity.Schedule;
import acme.schedule.service.impl.ScheduleServiceImpl;
import acme.util.FileTextService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhony
 */
public class EmployeeScheduleServiceImpl implements EmployeeScheduleService {

    @Override
    public int calculateTotalHours(String inHour, String outHour) {
        int inTime = Integer.parseInt(inHour.split(":")[0]);
        int outTime = Integer.parseInt(outHour.split(":")[0]);
        return outTime - inTime;
    }

    @Override
    public double calculateTotalCost(Schedule schedule, int totalHours) {
        double total = 0;
        total = schedule.getCost()*totalHours;
        return total;
    }

    @Override
    public List<EmployeeSchedule> getEmployeeSchedules(String lineSchedules) {
        FileTextService ft = new FileTextService();
        ScheduleServiceImpl scheduleServiceImpl = new ScheduleServiceImpl();
        List<EmployeeSchedule> listEmployeeSchedule = new ArrayList<>();
        String[] schedulesArray = ft.getSchedules(lineSchedules);
        for (int i = 0; i < schedulesArray.length; i++) {
            EmployeeSchedule emSch = new EmployeeSchedule();
            emSch.setInHour(ft.getInHour(schedulesArray[i]));
            emSch.setOutHour(ft.getOutHour(schedulesArray[i]));
           
            emSch.setTotalHours(calculateTotalHours(emSch.getInHour(), emSch.getOutHour()));
            String abbreviation = ft.getDaySchedule(schedulesArray[i]);
            Schedule schedule = scheduleServiceImpl.getScheduleByAbbreviationAndHours(abbreviation, Integer.parseInt(emSch.getInHour()), Integer.parseInt(emSch.getOutHour()));
            
            emSch.setSchedule(schedule);
           
            emSch.setTotalCost(calculateTotalCost(schedule, emSch.getTotalHours()));
            listEmployeeSchedule.add(emSch);
        }
        return listEmployeeSchedule;
    }

    @Override
    public double calculateAmountPayEmployee(List<EmployeeSchedule> employeeSchedules) {
        double totalPay=0;
        for (EmployeeSchedule employeeSchedule : employeeSchedules) {
            totalPay += employeeSchedule.getTotalCost();
        }
        return totalPay;
    }

}
