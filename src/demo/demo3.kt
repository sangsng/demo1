package demo

/**
 * Created by Sangsng on 2017/7/11.
 * @param 求数字的递归合计
 */
tailrec fun sum(n: Int, res: Int): Int {
    if (n <= 0) {
        return res
    } else {
        return sum(n - 1, res + n)
    }
}

fun main(args: Array<String>) {
    println(sum(5000000, 0))

}