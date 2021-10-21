package livroAlgoritmos.cap04

import java.util.*

//Efetuar a leitura de quatro valores numéricos inteiros representados pelas variáveis A, B, C e D.
//Apresentar apenas os valores que sejam divisíveis por 2 ou 3.

fun main() {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um valor para a variável a:")
    val a = scan.nextInt()

    println("Digite um valor para a variável b:")
    val b = scan.nextInt()

    println("Digite um valor para a variável c:")
    val c = scan.nextInt()

    println("Digite um valor para a variável d:")
    val d = scan.nextInt()

    if (a % 2 == 0 || a % 3 == 0) {
        println("$a é divisível por 2 ou 3")
    } else {
        println("O valor apresentado não é divisível por 2 ou 3")
    }

    if (b % 2 == 0 || b % 3 == 0) {
        println("$b é divisível por 2 ou 3")
    } else {
        println("O valor apresentado não é divisível por 2 ou 3")
    }

    if (c % 2 == 0 || c % 3 == 0) {
        println("$c é divisível por 2 ou 3")
    } else {
        println("O valor apresentado não é divisível por 2 ou 3")
    }

    if (d % 2 == 0 || d % 3 == 0) {
        println("$d é divisível por 2 ou 3")
    } else {
        println("O valor apresentado não é divisível por 2 ou 3")
    }
}
