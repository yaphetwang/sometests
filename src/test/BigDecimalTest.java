package test;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wyf
 * @date 2019/10/23 20:26
 * @description
 */
public class BigDecimalTest {
    static String REGEX_POSITIVE_DECIMAL = "^\\+?([1-9]+\\.\\d+|0\\.\\d*[1-9])$";
    static String REGEX_POSITIVE_INTEGER = "^\\+?[1-9]\\d*$";

    //最多带两位小数的数字
    static String ss = "^([0-9]*)+(.[0-9]{1,2})?$";
    //非零开头的最多带两位小数的数字
    static String ss1 = "^([1-9][0-9]*)+(.[0-9]{1,2})?$";

    public static void main(String[] args) {
        BigDecimal totalPrice = new BigDecimal("0.02");
        System.out.println(totalPrice.toString());

        BigDecimal minDownPaymentPrice = totalPrice.multiply(new BigDecimal(5)).
                divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(minDownPaymentPrice.toString());

        System.out.println(minDownPaymentPrice.compareTo(new BigDecimal("0.015")));

        System.out.println(isPositiveRealNumber("54.791"));
        System.out.println(isMatch(ss,"0.011"));

    }

    public static boolean isPositiveRealNumber(String orginal) {
        return isPositiveDecimal(orginal) || isPositiveInteger(orginal);
    }

    private static boolean isMatch(String regex, String orginal) {
        if (orginal == null || orginal.trim().equals("")) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher isNum = pattern.matcher(orginal);
        return isNum.matches();
    }

    public static boolean isPositiveInteger(String orginal) {
        return isMatch(REGEX_POSITIVE_INTEGER, orginal);
    }

    public static boolean isPositiveDecimal(String orginal) {
        return isMatch(REGEX_POSITIVE_DECIMAL, orginal);
    }
}