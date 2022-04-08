package hackerRank

/**Given five positive integers, find the minimum and maximum values that can be calculated
by summing exactly four of the five integers. Then print the respective minimum and
maximum values as a single line of two space-separated long integers.
Sample Input
1 2 3 4 5
Sample Output
10 14
 **/

fun miniMaxSum(arr: Array<Int>): Unit {
    //Passinhos:
    // primeiro: encontrar o valor minimo da soma do array
    // segundo: encontrar o valor maximo da soma do array
    // terceiro: encontrar a soma total do array

    var min = Int.MAX_VALUE // Int.MAX.VALUE determina um valor máximo para MIN porque nao tem nada menor que zero, né
    var max = 0
    var sum = 0 // soma dos numeros do array

    //para encontrar a soma do array:
    for (number in arr.indices) {
        //para cada numero desse array primeiro adiciono esse numero na SUM
        sum += number // resultado da soma do array
        if (number < min) min = number // se esse número do array for menor que o MIN, o MIN recebe o número
        if (number > max) max = number // se esse número do array for maior que o MAX, o MAX recebe o número
    }
    // para encontrar o valor min e max =  subtraio o minimo da soma(min) e o máximo da soma (max)
    println("${sum - max} ${sum - min}")

}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    miniMaxSum(arr)
}