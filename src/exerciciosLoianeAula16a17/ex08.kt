package exerciciosLoianeAula16a17

import java.util.*

//Faça um programa que leia 5 números e informe a soma e a média do números

fun main() {

    exOito()

}

fun exOito(){

    var media : Int
    var num: Int
    var soma= 0

    for (i in 1..5){

        val scanner = Scanner(System.`in`).useLocale(Locale.US)
        println("Insira um número: ")
        num = scanner.nextInt()
        soma += num
    }
    media = soma/5

    println("A soma é $soma")
    println("A media é $media")
}