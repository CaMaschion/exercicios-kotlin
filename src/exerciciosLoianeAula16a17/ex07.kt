package exerciciosLoianeAula16a17

import java.util.*

//Faça um programa que leia 5 números e informe o maior número.
fun main() {
    exSete()
}

fun exSete() {

    var maior = 0
    var num : Int

    for (i in 1..5) {

            val scanner = Scanner(System.`in`).useLocale(Locale.US)
            println("Insira um número: ")
            num = scanner.nextInt()

            if (num > maior) {
                maior = num
            }
    }

    println(" O maior número digitado é $maior")
}
