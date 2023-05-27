package exerciciosLoianeAula16a17

import java.util.*

//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no
//intervalo compreendidos por eles.

fun main() {
    exDez()
}

fun exDez(){

    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val num1 = scanner.nextInt()

    val scanner2 = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira um número: ")
    val num2 = scanner2.nextInt()

    for (i in num1..num2){
        println(i)
    }

}