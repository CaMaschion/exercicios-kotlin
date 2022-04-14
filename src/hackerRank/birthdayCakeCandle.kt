package hackerRank

fun birthdayCakeCandles(candles: Array<Int>): Int {

    var tallest = 0
    var counter = 0

    //descobrir qual a vela mais alta no array
    for(candle in candles.indices) {
        if(candles[candle] > tallest) {
            tallest = candle
        }
    }

    // quantas vezes a vela mais alta aparece
    for(candle in candles.indices) {
        if(candles[candle] == tallest){
            counter++
        }
    }
    return counter
}

fun birthdayCakeCandles1(candles: Array<Int>): Int {
    val tallest = candles.maxOrNull()
    return candles.count{ it == tallest}
}

fun birthdayCakeCandles2(candles: Array<Int>): Int {
    val tallest = candles.maxOrNull()
    var counter = 0

    for(i in candles.indices) {
        if(candles[i] == tallest){
            counter++
        }
    }
    return counter
}

fun birthdayCakeCandles3(candles: Array<Int>): Int {
    return candles.count{ it == candles.maxOrNull()}
}

fun main(args: Array<String>) {

    println(birthdayCakeCandles3(arrayOf(3,2,1,3)))

}
