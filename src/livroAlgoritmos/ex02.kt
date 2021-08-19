package livroAlgoritmos

import java.util.*

//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
//A fórmula de conversão é C <- ((F-32) * 5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

fun main() {

    println("Calcular temperatura")
    val scan = Scanner(System.`in`).useLocale(Locale.US)

    println("Insira a temperatura em graus celsius")
    val f = scan.nextDouble()

    val c = ((f-32)* 5)/9

    println("A temperatura em graus fahrenheit é $c")

}