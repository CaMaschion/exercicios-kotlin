package hackerRank

fun birthdayCakeCandles(candles: Array<Int>): Int {

    var unitHigh = 1
    var counter = 0

    for(i in candles.indices) {
        if(candles[i] > unitHigh) {
            unitHigh = candles[i]
        }
    }

    for(i in candles.indices) {
        if(candles[i] == unitHigh){
            counter++
        }
    }
    return counter
}

fun main(args: Array<String>) {

    println(birthdayCakeCandles(arrayOf(3,2,1,3)))

}
