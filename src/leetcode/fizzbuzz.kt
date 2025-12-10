package leetcode

fun main() {
    val n = 3
    val result = fizzBuzz(n)

    for (item in result) {
        println(item) // Imprime cada item no console
    }
}
fun fizzBuzz(n: Int): MutableList<String> {
    val result = mutableListOf<String>()
    for (i in 1..n) {
        when{
            i % 3 == 0 && i % 5 == 0 -> result.add("FizzBuzz")
            i % 3 == 0 -> result.add("Fizz")
            i % 5 == 0 -> result.add("Buzz")
            else -> result.add(i.toString())
        }
    }
     return result
}
