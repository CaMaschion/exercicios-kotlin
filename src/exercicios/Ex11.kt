package exercicios

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número inteiro")
    val numInt = scan.nextInt()

    println("Insira novamente um número inteiro")
    val numInt2 = scan.nextInt()

    println("Insira um número real")
    val numReal = scan.nextDouble()

    val a = (numInt * 2) * (numInt2 / 2)
    val b = (numInt * 3) + numReal
    val c = numReal * 3

    println("O produto do dobro do primeiro com metade do segundo é $a")
    println("A soma do triplo do primeiro com o terceiro é $b")
    println("O terceiro elevado ao cubo é $c")
}
