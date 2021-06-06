package exercicios

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira sua altura:")
    val altura = scan.nextDouble()

    val pesoIdeal = (72.7 * altura) - 58

    println("Seu peso ideal é de $pesoIdeal")
}
