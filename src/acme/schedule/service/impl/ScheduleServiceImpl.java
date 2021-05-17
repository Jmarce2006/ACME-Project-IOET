/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.schedule.service.impl;

import acme.schedule.entity.Schedule;
import acme.schedule.enums.DayEnum;
import acme.schedule.service.ScheduleService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhony
 */
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public List<Schedule> getDataDays() {
        List<Schedule> listSchedule = new ArrayList<>();

        /*
        *MONDAY
         */
        Schedule mo1 = new Schedule(DayEnum.MONDAY, "00:01", "09:00", new Double(25));
        listSchedule.add(mo1);
        Schedule mo2 = new Schedule(DayEnum.MONDAY, "09:01", "18:00", new Double(15));
        listSchedule.add(mo2);
        Schedule mo3 = new Schedule(DayEnum.MONDAY, "18:01", "24:00", new Double(20));
        listSchedule.add(mo3);

        /*
        *TUESDAY
         */
        Schedule tu1 = new Schedule(DayEnum.TUESDAY, "00:01", "09:00", new Double(25));
        listSchedule.add(tu1);
        Schedule tu2 = new Schedule(DayEnum.TUESDAY, "09:01", "18:00", new Double(15));
        listSchedule.add(tu2);
        Schedule tu3 = new Schedule(DayEnum.TUESDAY, "18:01", "24:00", new Double(20));
        listSchedule.add(tu3);

        /*
        *WEDNESDAY
         */
        Schedule we1 = new Schedule(DayEnum.WEDNESDAY, "00:01", "09:00", new Double(25));
        listSchedule.add(we1);
        Schedule we2 = new Schedule(DayEnum.WEDNESDAY, "09:01", "18:00", new Double(15));
        listSchedule.add(we2);
        Schedule we3 = new Schedule(DayEnum.WEDNESDAY, "18:01", "24:00", new Double(20));
        listSchedule.add(we3);

        /*
        *THURSDAY
         */
        Schedule th1 = new Schedule(DayEnum.THURSDAY, "00:01", "09:00", new Double(25));
        listSchedule.add(th1);
        Schedule th2 = new Schedule(DayEnum.THURSDAY, "09:01", "18:00", new Double(15));
        listSchedule.add(th2);
        Schedule th3 = new Schedule(DayEnum.THURSDAY, "18:01", "24:00", new Double(20));
        listSchedule.add(th3);

        /*
        *FRIDAY
         */
        Schedule fr1 = new Schedule(DayEnum.FRIDAY, "00:01", "09:00", new Double(25));
        listSchedule.add(fr1);
        Schedule fr2 = new Schedule(DayEnum.FRIDAY, "09:01", "18:00", new Double(15));
        listSchedule.add(fr2);
        Schedule fr3 = new Schedule(DayEnum.FRIDAY, "18:01", "24:00", new Double(20));
        listSchedule.add(fr3);

        /*
        *SATURDAY
         */
        Schedule sa1 = new Schedule(DayEnum.SATURDAY, "00:01", "09:00", new Double(30));
        listSchedule.add(sa1);
        Schedule sa2 = new Schedule(DayEnum.SATURDAY, "09:01", "18:00", new Double(20));
        listSchedule.add(sa2);
        Schedule sa3 = new Schedule(DayEnum.SATURDAY, "18:01", "24:00", new Double(25));
        listSchedule.add(sa3);

        /*
        *SUNDAY
         */
        Schedule su1 = new Schedule(DayEnum.SUNDAY, "00:01", "09:00", new Double(30));
        listSchedule.add(su1);
        Schedule su2 = new Schedule(DayEnum.SUNDAY, "09:01", "18:00", new Double(20));
        listSchedule.add(su2);
        Schedule su3 = new Schedule(DayEnum.SUNDAY, "18:01", "24:00", new Double(25));
        listSchedule.add(su3);

        return listSchedule;
    }

    @Override
    public Schedule getScheduleByAbbreviationAndHours(String abbreviation, int inHour, int outHour) {
        List<Schedule> listSchedules = getDataDays();
        Schedule schedule = new Schedule();
        for (Schedule sch : listSchedules) {
            int startHour = Integer.parseInt(sch.getStartHour().split(":")[0]);
            int endHour = Integer.parseInt(sch.getEndHour().split(":")[0]);
            if (sch.getDay().getAbbreviation().equals(abbreviation) && startHour <= inHour && endHour >= outHour) {
                schedule = sch;
                break;
            }
        }
        return schedule;
    }

}
