package exerciciosLoianeAula16a17

import java.util.*

//Altere o programa anterior para mostrar no final a soma dos números

fun main() {
    exOnze()
}

fun exOnze() {

    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val num1 = scanner.nextInt()

    val scanner2 = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val num2 = scanner2.nextInt()

    var soma = 0

    for (i in num1..num2) {
        soma += i
        println(i)
    }

    println("A soma é $soma")

}
