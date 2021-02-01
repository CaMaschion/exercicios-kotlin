package parte01

import java.util.*

fun main () {

    println("Cálcule a área de um quadrado: ")

    val scan = Scanner(System.`in`)
    val base = scan.nextLine().toInt()
    val altura = scan.nextLine().toInt()

    val area = (base * altura) * 2

    println("A área do círculo é de: $area")
}