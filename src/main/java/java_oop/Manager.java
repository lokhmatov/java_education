package java_oop;

import java_oop.models.Staff;
import java_oop.service.Schedule;

import java.time.LocalDate;
import java.util.List;

public class Manager {

    public static void main(String[] args) {

        // -- Initialization LocalDate object
        LocalDate initial = LocalDate.now();
        LocalDate startDate = initial.withDayOfMonth(1);
        LocalDate endDate = initial.withDayOfMonth(initial.lengthOfMonth());

        // -- Initialization list of staff
        List<Staff> listOfStaff = List.of(
                new Staff("Юра"),
                new Staff("Дима"),
                new Staff("Женя"),
                new Staff("Рома"));

        // -- Generate schedule
        Schedule schedule = new Schedule();
        List<Staff> result = schedule.generateSchedule(startDate, endDate, listOfStaff);
        schedule.printSchedule(result);
    }
}

