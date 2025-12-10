package leetcode

fun main() {
    val num = 14
    val result = numberOfSteps(num)

    println(result)
}

fun numberOfSteps(num: Int): Int {
    var n = num
    var steps = 0

    while (n != 0) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n -= 1
        }
        steps++
    }

    return steps
}