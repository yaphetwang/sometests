package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ss = "2019-02-01";

        System.out.println(getAge(sdf.parse(ss)));

        System.out.println(getTreeMap());
    }

    private static String getAge(Date birthday) {
        int MONTH = 12;
        long bornTime = birthday.getTime();
        long currentTime = System.currentTimeMillis();
        if (!(currentTime > bornTime)) {
            return "";
        }
        long times = currentTime - bornTime;
        int months = (int) (times / 1000 / 60 / 60 / 24 / 30);
        if (months == 0) {
            return (int) (times / 1000 / 60 / 60 / 24) + "天";
        }
        if (months / MONTH == 0) {
            return months + "个月";
        } else {
            return months / MONTH + "年" + (months % MONTH == 0 ? "" : months % MONTH + "个月");
        }
    }

    private static Map<String, String> getTreeMap() {
        //TreeMap 默认是升序排序
        Map<String, String> map = new LinkedHashMap<>();
        map.put("hotList", "fdsfsdfsd");
        map.put("A", "dddddddddddddddd");
        map.put("S", "fdsfdsfds");
        return map;
    }
}