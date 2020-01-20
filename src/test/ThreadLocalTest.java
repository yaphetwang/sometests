package test;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author wyf
 * @date 2019/8/23 14:53
 * @description
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new InheritableThreadLocal();
        threadLocal.set("Hello");
        System.out.println("当前线程是：" + Thread.currentThread().getName());
        System.out.println("在当前线程中获取：" + threadLocal.get());
        new Thread(() -> System.out.println("现在线程是" + Thread.currentThread().getName() + "尝试获取：" + threadLocal.get())).start();


        String xx = "42534.005";
        System.out.println(xx.contains(".00"));

        String sku = "9938|颜色分类:白色;车辆版本:测试SKU1";
        int idx1 = sku.indexOf("颜色分类:");
        int idx2 = sku.indexOf(":");
        int idx3 = sku.indexOf(";");

        int start = sku.indexOf("颜色分类:") + 5;
        int ind1 = sku.indexOf(";", start);

        System.out.println(sku.substring(start, ind1));

        System.out.println(idx1);
        System.out.println(idx2);
        System.out.println(sku.substring(idx1 + 5, idx3));

        String finance = "432435435,543534534534,5345345432342,";
        System.out.println(finance.indexOf("543534534534,"));

        BigDecimal b1 = new BigDecimal("0.00");
        BigDecimal b2 = new BigDecimal("2");
        BigDecimal b3 = new BigDecimal("1.00");
        BigDecimal b4 = new BigDecimal("0.00");
        System.out.println(b2.compareTo(b3));
        System.out.println(b1.compareTo(b3));
        System.out.println(b1.compareTo(b4));

        String ss = "  fdsfsdfd, fdsfse,   dfsfds  ";
        System.out.println(Arrays.asList(ss.trim().split(",")));
        System.out.println("ss:" + ss.trim());
        System.out.println("ss:" + ss.replace(" ",""));
    }

}