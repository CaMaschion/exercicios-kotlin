package livroAlgoritmos.cap04

import java.util.*

//Efetuar a leitura de dois valores numéricos inteiros representados pelas variáveis A e B
//e apresentar o resultado da diferença do maior valor pelo menor valor

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número:")
    val a = scan.nextInt()

    println("Digite um número:")
    val b = scan.nextInt()

    if (a > b) {
        println(a - b)
    } else {
        println(b - a)
    }
}
