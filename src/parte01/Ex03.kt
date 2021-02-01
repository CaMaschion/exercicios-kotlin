package parte01

import java.util.*

fun main () {

    val scan = Scanner(System.`in`)

    val num1 = scan.nextLine().toInt()
    val num2 = scan.nextLine().toInt()
    val resultado = num1 + num2

    println("A soma de $num1 + $num2 é: $resultado")
}