package java_oop.service;

import java_oop.models.Staff;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule implements ISchedule {


    @Override
    public List<Staff> generateSchedule(LocalDate startDate, LocalDate endDate, List<Staff> listOfStaff) {

        while (startDate.getMonthValue() == endDate.getMonthValue()) {
            for (Staff staff : listOfStaff) {
                if (startDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                    startDate = startDate.plusDays(2);
                }
                staff.getDutyDays().put(startDate.getDayOfMonth(), startDate.getDayOfWeek());
                startDate = startDate.plusDays(1);
            }
        }
        return listOfStaff;
    }

    @Override
    public void printSchedule(List<Staff> listOfStaff) {

    }
}

