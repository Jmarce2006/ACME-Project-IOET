/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.employeeschedule.entity;

import acme.schedule.entity.Schedule;

/**
 *
 * @author jhony
 */
public class EmployeeSchedule {

    private String inHour;
    private String outHour;
    private int totalHours;
    private double totalCost;
    private Schedule schedule;

    public EmployeeSchedule() {
        super();
    }
     
    public EmployeeSchedule(String inHour, String outHour, int totalHours, double totalCost, Schedule schedule) {
        super();
        this.inHour = inHour;
        this.outHour = outHour;
        this.totalHours = totalHours;
        this.totalCost = totalCost;
        this.schedule = schedule;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getInHour() {
        return inHour;
    }

    public void setInHour(String inHour) {
        this.inHour = inHour;
    }

    public String getOutHour() {
        return outHour;
    }

    public void setOutHour(String outHour) {
        this.outHour = outHour;
    }
    
}
