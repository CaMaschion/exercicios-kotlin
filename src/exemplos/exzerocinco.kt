package exemplos

////5. Faça um algoritmo que imprima a soma dos números de 1 a 100.
fun main() {
    println(
        search(
            arrayOf(2,5), target = 5
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

    if (num.last() < item) {
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

fun search2(nums: Array<Int>, target: Int): Int {
    if (target > nums.last()) {
        return -1
    }

    var arr = nums.copyOf()
    var midIndex = nums.size / 2

    while (arr.isNotEmpty()) {

        if (nums[midIndex] == target) {
            return midIndex
        }

        val index = arr.size / 2
        val first = arr.sliceArray(0 until index)
        val second = arr.sliceArray(index until nums.size)

        if (target > first.last()) {
            arr = second
            midIndex = midIndex + 1
        }

        if (target < second.first()) {
            arr = first
            midIndex = midIndex - 1
        }

    }
    return midIndex
}

fun search(nums: Array<Int>, target: Int): Int {

    if (nums.size == 1) {
        if (nums[0] == target) {
            return 0
        } else {
            return -1
        }
    }

    var left = 0
    var right = nums.size - 1
    var mid = 0

    while (left <= right) {

        mid = (left + right) / 2

        if (nums[mid] == target) {
            return mid
        } else if (target < nums[mid]) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return -1
}

