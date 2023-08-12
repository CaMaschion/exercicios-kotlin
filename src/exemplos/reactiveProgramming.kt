package exemplos

fun main() {

//    synchronousCode()
    asynchronousCode()

}

private fun synchronousCode() {
    var list = listOf(1, 2, 3)
    for (number in list) {
        println(number)
        list = listOf(4, 5, 6)
    }

    print(list)
}

private fun asynchronousCode() {
    var list = listOf(1, 2, 3)
    for (number in list) {
        println(number)
        list = listOf(4, 5, 6)
    }

    print(list)
}

