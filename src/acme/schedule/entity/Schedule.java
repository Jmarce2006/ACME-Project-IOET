/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.schedule.entity;

import acme.schedule.enums.DayEnum;

/**
 *
 * @author jhony
 */
public class Schedule {
    private DayEnum day;
    private String startHour;
    private String endHour;
    private Double cost;

    public Schedule(DayEnum day, String startHour, String endHour, Double cost) {
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
        this.cost = cost;
    }

    public Schedule() {
    }
    
    
    public DayEnum getDay() {
        return day;
    }

    public void setDay(DayEnum day) {
        this.day = day;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }
    
    
}
