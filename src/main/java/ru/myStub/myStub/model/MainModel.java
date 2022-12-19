package ru.myStub.myStub.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainModel {
    public String mainModel(String date) throws ParseException {
        String format = "yyyy-MM-dd hh:mm:ss";
        Calendar c = Calendar.getInstance();
        c.setTime(new SimpleDateFormat(format).parse(date));
        c.add(Calendar.DAY_OF_MONTH,1 );
        date = c.getTime().toString();
        return date;
    }

}