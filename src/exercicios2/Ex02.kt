package exercicios2

import java.util.*

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um valor")
    val valor = scan.nextInt()

    if (valor > 0){
        println("positivo")
    } else {
        println("negativo")
    }

}