package parte01

import java.util.*

fun main() {

    println("Converta metros para centímetros: ")

    val scan = Scanner(System.`in`)

    val convert = scan.nextLine().toDouble()
    val result = convert * 100

    println("O resultado é: $result")


}