package hackerRank

/** Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.
 *
 * (PT) Dada uma matriz de inteiros, calcule as razões de seus elementos que são positivos, negativos e zero.
 * Imprima o valor decimal de cada fração em uma nova linha com casas após o decimal.
 * **/

fun plusMinus(arr: Array<Int>): Unit {
    //criar 3 variáveis para cada "grupo"
    // percorrer o array(matriz) e somar cada "grupo" (positivos, negativos e zeros)
    //calcular a razao dividindo o soma dos numeros de cada grupo pelo tamanho do array

    var positiveNumber = 0.0
    var negativeNumber = 0.0
    var numberZero = 0.0

    for (number in arr) {
        when {
            number > 0 -> positiveNumber++
            number < 0 -> negativeNumber++
            else -> numberZero++
        }
    }

    val ratioPositive = positiveNumber/ arr.size
    val ratioNegative = negativeNumber / arr.size
    val ratioZero = numberZero / arr.size

    println("%.6f".format(ratioPositive))
    println("%.6f".format(ratioNegative))
    println("%.6f".format(ratioZero))

}

fun main(args: Array<String>) {

    val arr = arrayOf(1, 1, 0, -1, -1)

    plusMinus(arr)
}
