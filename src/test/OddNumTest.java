package test;

/**
 * @author wb-wyf372433
 * @date 2019/6/5 16:40
 * @description
 */
public class OddNumTest {
    public static void main(String[] args) {
        System.out.println(isOdd(-1));
    }

    private static boolean isOdd(int i) {
        return i % 2 == 1 || i % 2 == -1;
    }
}