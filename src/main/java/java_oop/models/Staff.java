package java_oop.models;

import java.time.DayOfWeek;
import java.util.Map;

public class Staff {
    private String staffName;
    private Map<Integer, DayOfWeek> dutyDays;

    public Staff(String staffName) {
        this.staffName = staffName;
    }

    public Staff(String staffName, Map<Integer, DayOfWeek> dutyDays) {
        this.staffName = staffName;
        this.dutyDays = dutyDays;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Map<Integer, DayOfWeek> getDutyDays() {
        return dutyDays;
    }

    public void setDutyDays(Map<Integer, DayOfWeek> dutyDays) {
        this.dutyDays = dutyDays;
    }
}
