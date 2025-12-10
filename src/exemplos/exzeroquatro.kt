package exemplos

import java.util.*

//4. Faça um algoritmo que receba um número N e imprima a tabuada de multiplicação de N (de 1 até 10).

fun main() {
    exZeroQuatro()
}

fun exZeroQuatro() {
    val scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número:")
    val n = scan.nextInt()
    var result: Int

    for (i in 1..10) {
        result = n * i
        println("$n x $i = $result")
    }
}
