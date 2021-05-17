/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.schedule.service;

import acme.schedule.entity.Schedule;
import java.util.List;

/**
 *
 * @author jhony
 */
public interface ScheduleService {
    
    public List<Schedule> getDataDays();
    public Schedule getScheduleByAbbreviationAndHours(String abbreviation, int inHour, int outHour);
}
