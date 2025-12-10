package leetcode

fun main() {

    val accounts = arrayOf(
        intArrayOf(1, 2, 3), // cliente 1: riqueza total = 6
        intArrayOf(3, 2, 1), // cliente 2: riqueza total = 6
        intArrayOf(4, 3, 1)  // cliente 3: riqueza total = 8
    )

    val result = maximumWealth(accounts)
    println("Maior riqueza: $result")

}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var wealth = 0
    for (customer in accounts) {
        var sum = 0
        for (account in customer) {
            sum += account
        }
        if (sum > wealth) {
            wealth = sum
        }
    }
    return wealth
}
