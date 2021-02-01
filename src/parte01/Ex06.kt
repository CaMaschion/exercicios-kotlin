package parte01

import java.util.*

fun main () {

    println("Cálcule o raio de um círculo: ")

    val scan = Scanner(System.`in`)
    val raio = scan.nextLine().toDouble()

    val area = 3.14 * (raio * 2)

    println("A área do círculo é de: $area")
}