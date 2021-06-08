package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número: ")
    val num1 = scan.nextInt()

    println("Digite outro número: ")
    val num2 = scan.nextInt()

    if (num1 > num2) {
        println(num1)
    } else {
        println(num2)
    }

}