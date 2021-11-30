package java_oop.service;

import java_oop.models.Staff;

import java.time.LocalDate;
import java.util.List;

public class Schedule implements ISchedule {


    @Override
    public List<Staff> generateSchedule(LocalDate startDate, LocalDate endDate, List<Staff> listOfStaff) {
        return null;
    }

    @Override
    public void printSchedule(List<Staff> listOfStaff) {

    }
}
