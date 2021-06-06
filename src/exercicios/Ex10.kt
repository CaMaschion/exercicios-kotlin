package exercicios

import java.util.*

fun main() {

    println("Calcular temperatura")
    val scan = Scanner(System.`in`)

    println("Insira a temperatura em graus Celsius")
    val c = scan.nextInt()

    val f = (c * 1.8) + 32

    println("A temperatura em grau fahrenheit é $f")
}