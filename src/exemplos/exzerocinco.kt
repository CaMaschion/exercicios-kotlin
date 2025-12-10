package exemplos

////5. Faça um algoritmo que imprima a soma dos números de 1 a 100.
fun main() {
    print(
        binarySearch(
            arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10), item = 0
        )
    )
}
//
//
//fun exZeroCinco() {
//    var soma = 0
//    for (i in 1..100){
//        soma += i
//    }
//    println(soma)
//
//}

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

//fun count(num: Array<Int>, index: Int = 0, counter: Int = 0): Int {
//    var count = counter
//
//    if (num.isEmpty()) {
//        return 0
//    }
//    if (index >= num.size) {
//        return count
//    }
//    count++
//
//    return count(num, index + 1, count)
//}

//fun getMax(num: Array<Int>, index: Int = 0, currentMax: Int = 0): Int {
//    var max = currentMax
//
//    if (num.isEmpty()) {
//        return 0
//    }
//
//    if (index >= num.size) {
//        return max
//    }
//
//    if (currentMax < num.indexOf(index)) {
//        max = num.indexOf(index)
//    }
//
//    return getMax(num, index + 1, max)
//}

fun binarySearch(num: Array<Int>, item: Int): Boolean {

    if ( num.last() < item ) {
        return false
    }

    val index = num.size / 2
    val value = num[index]
    val first = num.sliceArray(0 until index)
    val second = num.sliceArray(index until num.size)

    if (value == item) {
        return true
    }

    if (item > value) {
        return binarySearch(second, item)
    }

    if (item < value) {
        return binarySearch(first, item)
    }

    return false
}
