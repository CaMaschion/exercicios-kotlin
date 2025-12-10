package livroalgoritmos.cap04

import java.util.*

//Efetuar a leitura de um valor numérico inteiro positivo ou negativo representado pela variável
//N e apresentar o valor lido como sendo positivo. Dica: se o valor lido for menor que zero, ele
//deve ser multiplicado por -1.

fun main () {

    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Digite um número:")
    val n = scan.nextInt()

    val result = if (n > 0) {
        println(n)
    } else {
        println(n * -1)
    }

    println("O resultado é $result")
}