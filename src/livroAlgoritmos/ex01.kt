package livroAlgoritmos

import java.util.*

//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão
//        é F <- C*9/5+32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

fun main() {

    println("Calcular temperatura")
    val scan = Scanner(System.`in`).useLocale(Locale.US)

    println("Insira a temperatura em graus Celsius")
    val celsius = scan.nextDouble()

    val fahrenheit = (celsius * 1.8) + 32

    println("A temperatura em Fahrenheit é $fahrenheit")

}