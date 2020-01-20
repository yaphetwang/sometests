package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestMain {
    public static void main(String[] args) {
        File file = new File("D:\\projects\\library\\library-service\\src\\main\\java\\com\\alibaba\\middleware\\test.txt");
        Reader reader = null;
        try {
            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file), "utf-8");
            int tempchar;
            StringBuilder ss = new StringBuilder("");
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                ss.append((char) tempchar);
                System.out.println(tempchar);
            }
            String str = ss.toString();
            str=str.replace("\n", "<br>");
            str=str.replace("\r", "<br>");
            str=str.replace("\t", "<br>");
            str=str.replace("\"", "'");
            str=str.replace("\'", "'");

             System.out.println(str);

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
