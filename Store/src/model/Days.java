package model;

import java.util.ArrayList;
import java.util.List;

public class Days {
    public static final String MONDAY = "Monday";
    public static final String TUESDAY = "Tuesday";
    public static final String WEDNESDAY = "Wednesday";
    public static final String THURSDAY = "Thursday";
    public static final String FRIDAY = "Friday";
    public static final String SATURDAY = "Saturday";
    public static final String SUNDAY = "Sunday";


    public Days() {}

    public List<String> daysList()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(MONDAY);
        list.add(TUESDAY);
        list.add(WEDNESDAY);
        list.add(THURSDAY);
        list.add(FRIDAY);
        return list;

    }

    public List<String> weekendList()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(SATURDAY);
        list.add(SUNDAY);
        return list;
    }
}
