package exemplos

import java.util.*

//3. Dado um número inteiro positivo N,
// faça um algoritmo que imprima todos os números de N até 1, em ordem decrescente.

fun main() {
    exZeroTres()
}

fun exZeroTres() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número:")
    val n = scan.nextInt()

//    while (n != 0) {
//        println(n)
//        n--
//    }

    for (i in n downTo 1) {
        println(i)
    }
}