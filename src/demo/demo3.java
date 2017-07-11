package demo;

/**
 * Created by Sangsng on 2017/7/11.
 */
public class demo3 {
    public static void main(String[] args) {
        System.out.println(sum(5000, 0));
        System.out.println(sum2(5000, 0));
    }

    public static int sum(int n, int h) {
        if (n <= 0) {
            return h;
        } else {
            return sum(n - 1, h + n);
        }
    }

    public static int sum2(int n, int h) {
        return n <= 0 ? h : sum2(n - 1, h + n);
    }
}
