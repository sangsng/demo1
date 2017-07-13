package demo;

/**
 * Created by Sangsng on 2017/7/13.
 */
public class demo5 {
    public static void main(String[] args) {
        System.out.println(hasPrimeNum(1, 6));
    }

    /**
     * @param min 最小
     * @param max 最大
     * @return 两个正整数之间的素数数量
     */
    public static int hasPrimeNum(int min, int max) {
        int count = 0;
        for (int i = min; i < max + 1; i++) {
            if (i == 1 || i == 2) {
                count++;
                //System.out.println(i);
            } else {
                if (isPrime(i)) {
                    count++;
                    //System.out.println(i+" "+isPrime(i));
                }
            }

        }
        return count;
    }

    /**
     * @param n 判断是否素数
     * @return boolean
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
