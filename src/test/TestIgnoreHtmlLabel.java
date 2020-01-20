package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIgnoreHtmlLabel {

    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("\\B" + "称帝" + "\\B(?=[^<>]*<)", Pattern.DOTALL);
        String ss = "<p style=''>1804年12月2日，拿破仑在巴黎圣母院称帝，教宗庇护七世出席了加冕典礼。按照惯例，应该由庇护七世为拿破仑戴上皇冠；但拿破仑却示意庇护七世离开，亲手将皇冠戴在自己头上。随后将皇冠戴在约瑟芬的头上，亲自将她加冕为皇后。</p>";
        Pattern pattern = Pattern.compile("巴黎圣母院" + "(?=[^<>]*<)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(ss);

        StringBuffer stringBuffer = new StringBuffer();
        boolean flag = matcher.find();
        int i = 0;
        while (flag) {
            matcher.appendReplacement(stringBuffer, "test");
            i++;
            System.out.println("第" + i + "次匹配后的内容是" + stringBuffer);
            flag = matcher.find();
        }
        matcher.appendTail(stringBuffer);
        ss = stringBuffer.toString();
        System.out.println(ss);
    }

}
