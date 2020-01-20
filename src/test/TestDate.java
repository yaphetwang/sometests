package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class TestDate {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        Date date = calendar.getTime();
        String dateStr = new SimpleDateFormat("yyyyMMdd").format(date);
        System.out.println(dateStr);

        System.out.println(0 / 4);
        System.out.println(4 % 4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println("GUK型号".contains("型号"));

        AtomicInteger integer = new AtomicInteger(0);
        System.out.println(integer.getAndIncrement());
        System.out.println(integer.get());
    }


}
