package java_oop.service;

import java_oop.models.Staff;

import java.time.LocalDate;
import java.util.List;

public interface ISchedule {
    List<Staff> generateSchedule(LocalDate startDate, LocalDate endDate, List<Staff> listOfStaff);
    void printSchedule(List<Staff> listOfStaff);
}
