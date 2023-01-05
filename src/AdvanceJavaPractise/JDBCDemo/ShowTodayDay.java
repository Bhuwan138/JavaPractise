package AdvanceJavaPractise.JDBCDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class ShowTodayDay {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate d = LocalDate.now();
        System.out.println(d.getDayOfMonth());

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//        System.out.println(simpleDateFormat.format(date));
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));
        System.out.println(new Date());
        System.out.println(date.getDay());
    }
}
