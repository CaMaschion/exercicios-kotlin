package hackerRank

fun birthdayCakeCandles(candles: Array<Int>): Int {

    var highestCandle = 1
    var counter = 0

    //descobrir qual a vela mais alta no array
    for(i in candles.indices) {
        if(candles[i] > highestCandle) {
            highestCandle = candles[i]
        }
    }

    // quantas vezes a vela mais alta aparece
    for(i in candles.indices) {
        if(candles[i] == highestCandle){
            counter++
        }
    }
    return counter
}

fun birthdayCakeCandles2(candles: Array<Int>): Int {
    val unitHigh = candles.maxOrNull()
    var counter = 0

    for(i in candles.indices) {
        if(candles[i] == unitHigh){
            counter++
        }
    }
    return counter
}

fun main(args: Array<String>) {

    println(birthdayCakeCandles2(arrayOf(3,2,1,3)))

}
