package hackerHank

/**Given five positive integers, find the minimum and maximum values that can be calculated
by summing exactly four of the five integers. Then print the respective minimum and
maximum values as a single line of two space-separated long integers.
Sample Input
1 2 3 4 5
Sample Output
10 14
 **/

fun miniMaxSum(arr: Array<Int>): Unit {
    var max = 0L
    var min = arr[0].toLong()
    var total = 0L

    for (i in arr.indices) {
        val item = arr[i].toLong()
        total += item
        if (item < min) {
            min = item
        }
        if (item > max) {
            max = item
        }
    }
    println("${total - max} ${total - min}")

}


fun main() {

    val arr = arrayOf(1, 2, 3, 4, 5)

    miniMaxSum(arr)
}